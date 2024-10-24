import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicstatecodelab.WaterCounter


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier)
}


@Preview
@Composable
fun ScreenPreview(modifier: Modifier = Modifier) {
    WellnessScreen()
}