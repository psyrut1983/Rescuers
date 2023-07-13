package com.example.rescuers.presentation

import android.os.Bundle
import android.view.animation.OvershootInterpolator

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rescuers.R
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
    Navigation()
}

        }
    }
}


@Preview
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }
        
        composable("main_screen") {
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

                        onClick = {navController.navigate("ScautRegistrationScreen") })
                    {
                        Text(text = "Я Волонтер")
                    }
                    Button(modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                        shape = RoundedCornerShape(15.dp),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        onClick = { /*TODO*/ }) {
                        Text(text = "Я администратор")

                    }
                }
            }
        }
            composable("ScautRegistrationScreen"){
              Column(modifier = Modifier.fillMaxSize()) {

                  Card(
                      modifier = Modifier
                          .fillMaxWidth()
                          .padding(10.dp),
                      shape = RoundedCornerShape(15.dp),
                      elevation = CardDefaults.cardElevation(5.dp)
                  ) {
                      Text(color = Color.Black, text = "Экран Ввода информации о волонтере")
                  }
                  Card(
                      modifier = Modifier
                          .fillMaxWidth()
                          .padding(10.dp),
                      shape = RoundedCornerShape(15.dp),
                      elevation = CardDefaults.cardElevation(5.dp)
                  ) {
                      Text(color = Color.Black, text = "Экран Ввода информации о волонтере")
                  }
                  Card(
                      modifier = Modifier
                          .fillMaxWidth()
                          .padding(10.dp),
                      shape = RoundedCornerShape(15.dp),
                      elevation = CardDefaults.cardElevation(5.dp)
                  ) {
                      Text(color = Color.Black, text = "Экран Ввода информации о волонтере")
                  }
                  Card(
                      modifier = Modifier
                          .fillMaxWidth()
                          .padding(10.dp),
                      shape = RoundedCornerShape(15.dp),
                      elevation = CardDefaults.cardElevation(5.dp)
                  ) {
                      Text(color = Color.Black, text = "Экран Ввода информации о волонтере")
                  }
              }
            }



        
    }
}

@Composable
fun SplashScreen(navController: NavController){
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }
LaunchedEffect(key1 = true){
    scale.animateTo(
        targetValue = 1f,
        animationSpec = tween(
          durationMillis = 1000,
          easing = {
              OvershootInterpolator(2f).getInterpolation(it)
          }
        )
    )
    delay(3000L)
navController.navigate("main_screen")
}

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(R.mipmap.ic_launcher_foreground),
            contentScale = ContentScale.Crop,

            contentDescription = "Logo",
            modifier = Modifier
                .scale(scale.value)
                .clip(CircleShape))
    }


}


