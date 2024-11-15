package com.example.bottomnvagiationdemo.Pages

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyApp() {
    val movies = listOf(
        "TransformerOne",
        "Amazing Spider man",
        "The Shaw Redemption",
        "The Godfather",
        "The Matrix",
        "The Dark Knight",
        "Spider man far",
        "Avengers Endgame",
        "Pulp Fiction",
        "Blade Runner",
    )
    MyApp(
        modifier = Modifier,
        movies
    )
}


@Composable
fun MyApp(modifier: Modifier = Modifier, movies: List<String>) {
    Surface(modifier.fillMaxSize().background(Color.White).padding(10.dp)){
    Column(modifier.fillMaxSize()) {
        LazyRow(contentPadding = PaddingValues(10.dp)) {
            items(items = movies) { item ->
                RowItem(modifier = modifier, name = item)
            }
        }

        LazyColumn(contentPadding = PaddingValues(10.dp)) {
            items(items = movies) { item ->
                ColumnItem(modifier = modifier, name = item)
            }
        }
    }
    }
}


@Composable
fun ColumnItem(modifier: Modifier, name: String) {
    Card(
        modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(3f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Text(text = name, fontSize = 28.sp, fontWeight = FontWeight.Bold)

        }

    }
}



@Composable
fun RowItem(modifier: Modifier, name: String) {
    Card(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
            Text(text = name, fontSize = 28.sp, fontWeight = FontWeight.Bold)

        }

    }

}























