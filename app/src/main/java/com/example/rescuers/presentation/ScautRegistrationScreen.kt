package com.example.rescuers.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rescuers.R

@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun ScautRegistrationScreen() {
    val keyboardController = LocalSoftwareKeyboardController.current

    var firstName = remember {
        mutableStateOf("")
    }
    var lastName = remember {
        mutableStateOf("")
    }
    var callSign = remember {
        mutableStateOf("")
    }

    var qrSetUpOnButtonClick = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Row() {
               TextField("Имя", firstName)
            }
            Row() {
                TextField("Фамилия", lastName)
            }
            Row() {
                TextField("Позывной", callSign)
            }
            Row() {
                Button(
                    onClick = {
                        keyboardController?.hide()
                        qrSetUpOnButtonClick.value = true

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(15.dp),
                    elevation = ButtonDefaults.buttonElevation(5.dp),
                    colors = ButtonDefaults.buttonColors(MySquadBlueColor),
                ) {
                    Text(text = "Создать QR")
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),

                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                colors = CardDefaults.cardColors(Color.White)){
                Box(modifier = Modifier.fillMaxSize(),
                    Alignment.Center){
                  if (qrSetUpOnButtonClick.value == true){
                    QrImageTest()}
                }


            }


        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(label: String, t:MutableState<String>) {
    var text by remember { mutableStateOf("") }
    TextField(value = text,
        onValueChange = {text = it},
        label = { Text(label) },
        textStyle = TextStyle(
            fontSize = (20.sp),
            color = Color.DarkGray
        ),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White
        )




    )
    t.value = text
}




@Preview
@Composable
fun QrImageTest(){
    Image(painter = painterResource(R.drawable.qr) ,
        contentDescription = "тестовый QR",
        Modifier.size(150.dp)
        )
}






