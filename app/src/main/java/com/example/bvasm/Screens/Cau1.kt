package com.example.bvasm.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bvasm.R

data class Product(
    var id: Int,
    var name: String,
    var price: String,
    var image: Int,
    var description: String
)

data class Category(
    var idCate: Int,
    var CateName: String
)

@Composable
fun ProductListScreen(navController: NavHostController) {
    var products by remember {
        mutableStateOf(
            listOf(
                Product(1, "Spender Plan", "1000", R.drawable.image1, "Description 1"),
                Product(2, "Another Product", "2000", R.drawable.image2, "Description 2"),
                Product(3, "Third Product", "1500", R.drawable.image3, "Description 3"),
                Product(1, "Spender Plan", "1000", R.drawable.image1, "Description 1"),
                Product(2, "Another Product", "2000", R.drawable.image2, "Description 2"),
                Product(3, "Third Product", "1500", R.drawable.image3, "Description 3")

            )
        )
    }
    var categories by remember {
        mutableStateOf(
            listOf(
                Category(1, "Tất cả"),
                Category(2, "Mới về"),
                Category(3, "Ưa sáng"),
                Category(4, "Ưa bóng")
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier.padding(top =20.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "",
                modifier = Modifier
                    .width(42.dp)
                    .height(42.dp)
            )
            Text(text = "Cây Trông")
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "",
                modifier = Modifier
                    .width(42.dp)
                    .height(42.dp)
            )
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(categories) { index, cate ->
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable { handleCategoryClick(cate) }
                ) {
                    Text(text = cate.CateName)
                }
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(products) { index, product ->
                ProductCard(product = product, onClick = { navController.navigate("product_detail/${product.id}") })
            }
        }
    }
}

@Composable
fun ProductCard(product: Product, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = product.image),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
            )
            Text(text = product.name, modifier = Modifier.padding(top = 10.dp))
            Text(text = product.description, modifier = Modifier.padding(top = 5.dp))
            Text(text = product.price, modifier = Modifier.padding(top = 5.dp))
        }
    }
}

fun handleClickItem(product: Product) {

}

fun handleCategoryClick(category: Category) {
    // Handle category click, e.g., filter products based on the selected category
}
