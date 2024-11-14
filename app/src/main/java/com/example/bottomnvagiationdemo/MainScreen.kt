package com.example.bottomnvagiationdemo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.example.bottomnvagiationdemo.Pages.MyApp
import com.example.bottomnvagiationdemo.Pages.ProfilePage
import com.example.bottomnvagiationdemo.Pages.SecondPage

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val navItemList = listOf(
        NavItem( "MyApp", Icons.Default.Home),
        NavItem( "SecondPage", Icons.Default.Settings),
        NavItem( "ProfilePage", Icons.Default.Person),
    )

    val selectedIndex = rememberSaveable() { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = index == selectedIndex.intValue,
                        onClick = { selectedIndex.intValue = index },
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
        ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex = selectedIndex.intValue)
    }
}


@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex : Int) {
    when(selectedIndex){
        0 -> MyApp()
        1 -> SecondPage()
        2 -> ProfilePage()
    }
}