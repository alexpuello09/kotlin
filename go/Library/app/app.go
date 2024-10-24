package main

import (
	"encoding/json"
	"github.com/gorilla/mux"
	"net/http"
)

func main() {
	router := mux.NewRouter()
	router.HandleFunc("/books", getBooks).Methods(http.MethodGet)
	_ = http.ListenAndServe(":8080", router)
}

type GenericResponse struct {
	Result  Result
	Success bool
	Message string
}

type Book struct {
	Name      string `json:"name"`
	Author    string `json:"author"`
	Pages     int    `json:"pages"`
	Published int    `json:"published"`
	Genre     string `json:"genre"`
}

type Result struct {
	Books []Book
}

func getBooks(w http.ResponseWriter, r *http.Request) {
	var books []Book
	books = append(
		books,
		Book{
			Name:      "Object Oriented Programming",
			Author:    "John Doe",
			Pages:     350,
			Published: 2018,
			Genre:     "Programming",
		},
		Book{
			Name:      "Los secretos de la mente millonaria",
			Author:    "T. Harv Eker",
			Pages:     272,
			Published: 2005,
			Genre:     "Self-help",
		},
		Book{
			Name:      "Álgebra de Baldor",
			Author:    "Aurelio Baldor",
			Pages:     630,
			Published: 1941,
			Genre:     "Mathematics",
		},
	)
	var result = GenericResponse{
		Result: Result{
			Books: books,
		},
		Success: true,
		Message: "Books fetched successfully",
	}
	w.Header().Set("Content-Type", "application/json")
	_ = json.NewEncoder(w).Encode(result)
}
