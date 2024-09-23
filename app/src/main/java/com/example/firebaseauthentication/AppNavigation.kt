package com.example.firebaseauthentication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthentication.Pages.HomePage
import com.example.firebaseauthentication.Pages.LoginPage
import com.example.firebaseauthentication.Pages.SignUpPage

@Composable
fun AppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Login",){
        composable("login") {
           LoginPage(modifier,navController, authViewModel)
        }

        composable("signup") {
            SignUpPage(modifier,navController, authViewModel)
        }

        composable("home") {
            HomePage(modifier,navController, authViewModel)
        }

    }
}