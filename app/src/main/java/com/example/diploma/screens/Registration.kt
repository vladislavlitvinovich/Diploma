package com.example.diploma.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diploma.navigation.NavRoutes
import com.example.diploma.ui.theme.DiplomaTheme

@Composable
fun Registration(navController: NavController) {
    Card(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
        ) {
            Button(onClick = {
                navController.navigate(NavRoutes.Authorization.route)
            }, Modifier.padding(10.dp)) {
                Text(text = "Назад")
            }
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(value = "Логин", onValueChange = {}, Modifier.padding(5.dp))
            TextField(value = "Пароль", onValueChange = {}, Modifier.padding(5.dp))
            TextField(value = "Повторите пароль", onValueChange = {}, Modifier.padding(5.dp))
            Button(onClick = { /*TODO*/ }, Modifier.padding(5.dp)) {
                Text(text = "Зарегистрироваться")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun RegistrationPreview() {
//    DiplomaTheme {
//        Registration()
//    }
//}