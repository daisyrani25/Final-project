package com.example.finalproject

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation()
{
val navController= rememberNavController()
NavHost(navController = navController, startDestination = Home.route ){
    composable(Home.route){
        Home(navController)
    }
    composable(Profile.route){
        Profile(navController)
}
    composable(route = "Onboard"){
        Onboard(navController)
    }

}}