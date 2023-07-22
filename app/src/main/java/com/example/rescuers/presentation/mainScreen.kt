package com.example.rescuers.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.rescuers.presentation.theme.MySquadBlueColor

@Composable
fun mainScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Это заглушка. Тут будет экран регистрации.", color = Color.Black)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom

        ) {
            Button(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                colors = ButtonDefaults.buttonColors(MySquadBlueColor),
                onClick = { navController.navigate("ScautRegistrationScreen") })
            {
                Text(text = "Я Волонтер")
            }
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                colors = ButtonDefaults.buttonColors(MySquadBlueColor),
                onClick = { navController.navigate("ManagerScreen") }) {
                Text(text = "Я администратор")

            }
        }
    }

}