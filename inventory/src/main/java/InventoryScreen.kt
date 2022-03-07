import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun InventoryScreen() {
    Column {

        repeat(times = 20) {
            Item()
        }
    }

}

@Composable
private fun Item() {
    Row {
        Text("Hello")
        Text("Bosch")
        Text("34")
    }
}

@Preview
@Composable
private fun ItemPreview() {
    Item()
}

@Preview
@Composable
private fun InventoryPreview() {
    InventoryScreen()
}


