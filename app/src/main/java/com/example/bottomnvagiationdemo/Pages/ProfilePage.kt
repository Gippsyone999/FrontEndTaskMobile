package com.example.bottomnvagiationdemo.Pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilePage(){
    LazyColumn(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        horizontalAlignment = Alignment.Start)
    {

    item {
        Column(modifier = Modifier
            .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Text(
                text = "Syahri Ghifari M",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(top = 70.dp)
            )
            Text(
                text = "syahrighifari@gmail.com",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                modifier = Modifier.padding(top = 5.dp)
            )
        }
    }
    item {
        Text(
            text = "Sekolah Tinggi Teknologi Nurul Fikri",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(start = 50.dp, top = 50.dp))
        Text(
            text = "TEKNIK INFORMATIKA",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = Modifier.padding(start = 50.dp, top = 15.dp, end = 50.dp))

        }
    }
}