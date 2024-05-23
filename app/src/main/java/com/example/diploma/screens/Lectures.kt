package com.example.diploma.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.diploma.R
import com.example.diploma.navigation.NavRoutes
import com.example.diploma.ui.theme.DiplomaTheme

@Composable
fun Lectures(navController: NavController) {
    Card(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LecturesDraw(navController)
        }
    }
}

@Composable
fun LecturesDraw(navController: NavController) {
    for (i: Int in 0..3) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(5.dp)
                    .clickable {
                    navController.navigate(route = "lectureView/$i")
                },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Card {
                    Text(
                        text = stringResource(id = R.string.lecture1 + i),
                        Modifier.padding(5.dp)
                    )
                }
            }
            Text(
                text = stringResource(id = R.string.lecture_mini_content),
                Modifier.padding(5.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LecturesPreview() {
//    DiplomaTheme {
//        Lectures()
//    }
//}