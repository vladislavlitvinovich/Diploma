package com.example.diploma.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.diploma.navigation.NavRoutes
import com.example.diploma.ui.theme.DiplomaTheme
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiplomaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    toTheReg()
                }
            }
        }
    }
}

@Composable
fun toTheReg() {
    val navController = rememberNavController()
    MainAuthorization(navController = navController)
    NavHost(navController, startDestination = NavRoutes.Authorization.route) {
        composable(NavRoutes.Authorization.route) { MainAuthorization(navController = navController) }
        composable(NavRoutes.Registration.route) { Registration(navController = navController) }
        composable(NavRoutes.Lectures.route) { Lectures(navController = navController) }
        composable(NavRoutes.LectureView.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        )
        {
            it.arguments?.getInt("id").toString()
            LectureView(navController = navController)
        }
        composable(NavRoutes.PracticeView.route) { PracticeView(navController = navController) }
    }
}

@Composable
fun MainAuthorization(navController: NavController) {
    Card(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(value = "Логин", onValueChange = {})
            TextField(value = "Пароль", onValueChange = {})
            Button(onClick = {
                navController.navigate(NavRoutes.Lectures.route)
            }) {
                Text(text = "Войти")
            }
            Button(onClick = {
                navController.navigate(NavRoutes.Registration.route)
            }) {
                Text(text = "Зарегистрироваться")
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun MainAuthorizationPreview() {
//    DiplomaTheme {
//        MainAuthorization()
//    }
//}