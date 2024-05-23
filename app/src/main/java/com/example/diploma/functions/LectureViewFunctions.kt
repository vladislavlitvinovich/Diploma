package com.example.diploma.functions

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diploma.R
import com.example.diploma.navigation.NavRoutes

@Composable
fun PracticeChoice(navController: NavController) {
    for (i: Int in 0..3)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .clickable {
                    navController.navigate(NavRoutes.PracticeView.route)
                }
        ) {
            Text(
                text = "Задание $i",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(10.dp)
            )
        }
}

@Composable
fun switchTheme(id: Int?): String {
    return when (id) {
        0 -> stringResource(R.string.lecture1)
        1 -> stringResource(R.string.lecture2)
        2 -> stringResource(R.string.lecture3)
        3 -> stringResource(R.string.lecture4)
        else -> {
            "Error"
        }
    }
}