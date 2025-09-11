package com.tepoz.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tepoz.foodapp.ui.theme.FoodAppTheme
import com.tepoz.foodapp.ui.theme.Lol
import com.tepoz.foodapp.ui.theme.bla
import com.tepoz.foodapp.ui.theme.wa
import com.tepoz.foodapp.ui.theme.xd


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        innerPadding
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .padding(innerPadding)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Persona",
                modifier = Modifier
                    .padding(5.dp)
                    .size(35.dp)
            )
            Text(
                text = "Hola, Tepoz",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp),
                fontSize = 25.sp
            )
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = "Salir",
                modifier = Modifier
                    .padding(5.dp)
                    .size(35.dp)
            )
        }
        Text(
            text = "Nuestras categorías",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 15.dp, top = 5.dp, bottom = 5.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(categories) { category ->
                CategoryCard(category = category)
            }
        }

        Text(
            text = "Busca los mejores restaurantes",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 15.dp, top = 10.dp, bottom = 5.dp)
        )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant = restaurant)
            }
        }
        Text(
            text = "Comida Recomendada",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 15.dp, top = 10.dp, bottom = 5.dp)
        )
        LazyVerticalGrid(
            columns = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .height(500.dp)
                .padding(10.dp)
        ) {
            items(foods) { food ->
                FoodCard(food = food)
            }
        }
    }
}

@Composable
fun CategoryCard(category: Category) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .background(xd),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = category.drawableRes),
                contentDescription = category.name,
                modifier = Modifier
                    .size(50.dp),

            )
        }
        Text(
            text = category.name,
            modifier = Modifier.padding(top = 5.dp),
            fontSize = 14.sp
        )
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .background(xd),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = restaurant.drawableRes),
                contentDescription = restaurant.name,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(
            text = restaurant.name,
            modifier = Modifier.padding(top = 5.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun FoodCard(food: Food) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(5.dp)
    ) {
        Box(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = food.drawableRes),
                contentDescription = food.name,
                modifier = Modifier
                    .fillMaxSize()
            )
            Text(
                text = food.price,
                color = wa,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(bla)
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 6.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Rating",
                tint = Lol,
                modifier = Modifier.size(16.dp)
            )
            Text(
                text = food.rating.toString(),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = food.name,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    FoodAppTheme {
        HomeScreen(PaddingValues(0.dp))
    }
}