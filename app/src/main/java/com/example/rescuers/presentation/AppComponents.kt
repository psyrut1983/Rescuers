package com.example.rescuers.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rescuers.R
import kotlin.math.round
import androidx.compose.material3.Text as Text

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center,

        )


}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ), color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )


}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldComponent(labelValue: String) {
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(modifier = Modifier.fillMaxWidth(),

    //clip(shape = RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.outlinedTextFieldColors(

            focusedBorderColor = colorResource(id = R.color.ColorPrimary),
            focusedLabelColor = colorResource(id = R.color.ColorPrimary),
            cursorColor = colorResource(id = R.color.ColorPrimary),


        ),
        keyboardOptions = KeyboardOptions.Default,

        value = textValue.value,
        onValueChange = {
            textValue.value = it},
        label = { Text(text = labelValue)},

        )


//

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextFieldComponent(labelValue: String) {
    val password = remember {
        mutableStateOf("")
    }
val passwoedVisible = remember {
    mutableStateOf(false)
}
    OutlinedTextField(modifier = Modifier.fillMaxWidth(),

    //clip(shape = RoundedCornerShape(10.dp)),
        colors = TextFieldDefaults.outlinedTextFieldColors(

            focusedBorderColor = colorResource(id = R.color.ColorPrimary),
            focusedLabelColor = colorResource(id = R.color.ColorPrimary),
            cursorColor = colorResource(id = R.color.ColorPrimary),


        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        value = password.value,
        onValueChange = {
            password.value = it},
        label = { Text(text = labelValue)},
       )

}