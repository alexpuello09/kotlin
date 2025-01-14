package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count = 0
    Column {
        Text(
            text = "You've had $count glasses.",
            modifier = modifier.padding(16.dp)
        )

        Button(onClick = { count++ }) {
            Text(text = "Add one")
        }
    }
}


@Preview
@Composable
fun WaterCounterPreview(modifier: Modifier = Modifier) {
    WaterCounter()
}