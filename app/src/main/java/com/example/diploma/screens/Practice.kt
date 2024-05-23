package com.example.diploma.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diploma.R
import com.example.diploma.functions.practiceAnswerDraw
import com.example.diploma.navigation.NavRoutes

@Composable
fun PracticeView(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(5.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(5.dp)
                        .clickable {
                            navController.navigate(NavRoutes.Lectures.route)
                        },
                    painter = painterResource(id = R.drawable.ic_backward),
                    contentDescription = "backward icon"
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                {
                    Text(
                        text = "Практика 1",
                        textAlign = TextAlign.Center
                    )
                }
            }
            Card(
                modifier = Modifier.fillMaxSize(0.8f)
            ) {
                for (i: Int in 0..10) {
                    Text(
                        stringResource(id = R.string.practice_content),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(20.dp)
                    )
                }
            }
            practiceAnswerDraw()
        }
    }
}
