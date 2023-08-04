package com.example.rescuers.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rescuers.R
import java.nio.file.WatchEvent

@Composable
fun SignUpScreen(){
    Surface (
      modifier = Modifier
          .fillMaxSize()
          .background(Color.White)
          .padding(28.dp)
    ){
Column (modifier = Modifier.fillMaxSize()){
    NormalTextComponent(value = stringResource(id = R.string.hello))
    HeadingTextComponent(value = stringResource(id = R.string.createAccount))

    Spacer(modifier = Modifier.height(20.dp))

    MyTextFieldComponent(labelValue = "Имя")
    MyTextFieldComponent(labelValue = "Фамилия")
    MyTextFieldComponent(labelValue = "Позывной")
    MyTextFieldComponent(labelValue = "Email")
    MyTextFieldComponent(labelValue = "Номер телефона")
    PasswordTextFieldComponent(labelValue = "Пароль")
}


    }

}



@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
SignUpScreen()

}