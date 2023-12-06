package com.omidavz.nftmarketplaceapp

import android.annotation.SuppressLint
import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.omidavz.nftmarketplaceapp.home.HomeScreen
import com.omidavz.nftmarketplaceapp.onboarding.OnboardingScreen
import com.omidavz.nftmarketplaceapp.stats.StatsScreen
import com.omidavz.nftmarketplaceapp.ui.theme.NftMarketplaceAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RootScreen() {

    val navigationController = rememberNavController()
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }



    Scaffold(
        bottomBar = {
            if (!shouldShowOnboarding) {
                BottomBar(navController = navigationController)
            }
        }

    ) {
        NavHost(
            navController = navigationController,
            startDestination = if (shouldShowOnboarding) NavigationItem.Login.route else NavigationItem.Home.route
        ) {
            composable(NavigationItem.Login.route) {
                OnboardingScreen(navigateAction = {
                    navigationController.navigate(NavigationItem.Home.route)
                    shouldShowOnboarding = false
                })
            }
            composable(NavigationItem.Home.route) {
                HomeScreen()
            }
            composable(NavigationItem.Stats.route) {
                StatsScreen()
            }
            composable(NavigationItem.Add.route) {
                Text(
                    text = "Add"
                )
            }
            composable(NavigationItem.Search.route) {
                Text(text = "Search")
            }
            composable(NavigationItem.Profile.route) {
                Text(text = "Profile")
            }

        }
    }

}

@Preview
@Composable
fun RootScreenPreview() {
    NftMarketplaceAppTheme {
        RootScreen()
    }
}

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Login : NavigationItem("login", Icons.Filled.Home, "Login")
    object Home : NavigationItem("home", Icons.Filled.Home, "Home")
    object Stats : NavigationItem("stats", Icons.Filled.Analytics, "Stats")
    object Add : NavigationItem("add", Icons.Filled.Add, "Add")
    object Search : NavigationItem("search", Icons.Filled.Search, "Search")
    object Profile : NavigationItem("profile", Icons.Filled.Person, "Profile")

}


@Composable
fun BottomBar(
    navController: NavController
) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Stats,
        NavigationItem.Add,
        NavigationItem.Search,
        NavigationItem.Profile,
    )

    NavigationBar(
        modifier = Modifier
            .height(56.dp),
        containerColor = Color(33, 17, 52),

        ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route





        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Image(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        modifier = Modifier.size(30.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedTextColor = Color.White,
                    unselectedTextColor = Color.White.copy(0.4f),

                ),
                alwaysShowLabel = false,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
