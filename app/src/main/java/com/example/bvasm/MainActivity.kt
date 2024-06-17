package com.example.bvasm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bvasm.Screens.Cau2
import com.example.bvasm.Screens.ProductListScreen
import com.example.bvasm.ui.theme.BvasmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BvasmTheme {
                AppNavigator()
            }
        }
    }
}


@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "product_list") {
        composable("product_list") { ProductListScreen(navController) }
        composable("product_detail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")
            Cau2(productId)
        }
    }
}



