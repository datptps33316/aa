package com.example.bvasm.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bvasm.R

@Composable
fun Cau2(productId :String? ) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
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
        Image(
            painter = painterResource(id = R.drawable.image1),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Row {
            Row(
                Modifier
                    .padding(top = 16.dp, start = 40.dp, end = 16.dp)
                    .background(Color.Green)
            ) {
                Text(text = "cây trồng ")
            }
            Row(
                Modifier
                    .padding(top = 16.dp, start = 40.dp, end = 16.dp)
                    .background(Color.Green)
            ) {
                Text(text = "ưu bóng ")
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 28.dp, end = 28.dp)) {
            Text(text = "250.000", color = Color.Green)
            
            Text(text = "chi tiết sản phẩm")
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Xuất xứ ")
                Text(text = "Nhỏ ")
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Tình trạng")
                Text(text = "Còn 150sp ", color = Color.Green)
            }
        }
        Row (modifier = Modifier.fillMaxWidth().padding(top = 20.dp ,start = 28.dp ,end = 28.dp)){
            Button(onClick = { } ,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Chọn Mua")
            }

        }

    }


}