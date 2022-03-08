import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import domain.Product

@Composable
fun InventoryScreen() {
    val products = arrayOf(
        Product(name = "Wheel", price = 34.2F, manufacturer = "Bosch", category = ""),
        Product(name = "Tire", price = 4.2F, manufacturer = "Bosch", category = ""),
        Product(name = "Oil", price = 34.2F, manufacturer = "Continental", category = ""),
        Product(name = "Wheel", price = 34.2F, manufacturer = "Bosch", category = ""),
        Product(name = "Wheel", price = 34.2F, manufacturer = "Bosch", category = ""),
    )

    LazyColumn {
        items(items = products) {
            Item(it)
        }
    }
}

@Composable
private fun Item(product: Product) {
    Row {
        Text(product.name)
        Text("\$${product.price}")
        Text(product.manufacturer)
    }
}

@Preview
@Composable
private fun ItemPreview() {
    //Item(it)
}

@Preview
@Composable
private fun InventoryPreview() {
    InventoryScreen()
}


