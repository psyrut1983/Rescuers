package com.example.rescuers.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rescuers.data.ScoutListClassModel
import com.example.rescuers.presentation.theme.MySquadBlueColor



@Composable
fun managerScreen(navController: NavController) {
    // это для показа тестового
    val smirnov: ScoutListClassModel = ScoutListClassModel("Максим ","Смирнов","скор")
    val kotov: ScoutListClassModel = ScoutListClassModel("Владимир ","Котов","итсист")
    val romanova: ScoutListClassModel = ScoutListClassModel("Виктория ","Романова","гигант")
    val jakovleva: ScoutListClassModel = ScoutListClassModel("Агата ","Яковлева","шахман")
    val holov: ScoutListClassModel = ScoutListClassModel("Артём ","Хохлов","азан")
    val konstantinov: ScoutListClassModel = ScoutListClassModel("Никита ","Константинов","Торн")
    val eremina: ScoutListClassModel = ScoutListClassModel("Екатерина ","Еремина","хаммер")
    val goncharova: ScoutListClassModel = ScoutListClassModel("Анастасия","Гончарова","Раскольников")
    val semenov: ScoutListClassModel = ScoutListClassModel("Александр","Семенов","якер")
    val dmitrieva: ScoutListClassModel = ScoutListClassModel("София ","Дмитриева","Хармонт")

    val scoutExampleList = mutableListOf<ScoutListClassModel>()
    scoutExampleList.add(smirnov)
    scoutExampleList.add(kotov)
    scoutExampleList.add(romanova)
    scoutExampleList.add(jakovleva)
    scoutExampleList.add(holov)
    scoutExampleList.add(konstantinov)
    scoutExampleList.add(eremina)
    scoutExampleList.add(goncharova)
    scoutExampleList.add(semenov)
    scoutExampleList.add(dmitrieva)

   Column() {


       Card(
           modifier = Modifier
               .fillMaxWidth()
               .padding(10.dp),
           shape = RoundedCornerShape(15.dp),
           elevation = CardDefaults.cardElevation(5.dp),
           colors = CardDefaults.cardColors(
               containerColor = Color.White
           )
       ) {
           Row() {
               Button(
                   modifier = Modifier
                       .fillMaxWidth(0.5F)
                       .padding(16.dp),
                   onClick = { /*TODO*/ },
                   colors = ButtonDefaults.buttonColors(MySquadBlueColor)
               ) {
                   Text(text = "Добавить")
               }
               Button(
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp),
                   onClick = {navController.navigate("QrCodeScannerScreen") },
                   colors = ButtonDefaults.buttonColors(MySquadBlueColor)
               ) {
                   Text(text = "Скан Qr")
               }

           }
       }
       Card(
           modifier = Modifier
               .fillMaxWidth()
               .padding(10.dp),
           shape = RoundedCornerShape(15.dp),
           elevation = CardDefaults.cardElevation(5.dp),
           colors = CardDefaults.cardColors(
               containerColor = Color.White
           )
       ) {
           LazyColumn(
               modifier = Modifier
                   .fillMaxSize()
                   .background(Color.White)
           ) {
               items(scoutExampleList) { model ->
                   ScoutItem(model = model)
               }

           }
       }
   }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScoutItem(model: ScoutListClassModel) {
    val itemClicked = remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        onClick = { itemClicked.value = !itemClicked.value },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row() {
            Text(
                text = model.firstName,
                fontSize = (20.sp),
                color = Color.DarkGray,
                modifier = Modifier.padding(5.dp)
            )
        }
        Row() {
            Text(
                text = model.lastName,
                fontSize = (20.sp),
                color = Color.DarkGray,
                modifier = Modifier.padding(5.dp)
            )
        }
        Row() {
            Text(
                text = model.callSign,
                fontSize = (20.sp),
                color = Color.DarkGray,
                modifier = Modifier.padding(5.dp)
            )
        }

        if (itemClicked.value == true) {
            buttonPanel()

        }
    }

}


@Preview
@Composable
fun buttonPanel() {
    Row() {
        Button(
            modifier = Modifier
                .fillMaxWidth(0.5F)
                .padding(16.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(MySquadBlueColor)
        ) {
            Text(text = "Выдано:")
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(MySquadBlueColor)
        ) {
            Text(text = "Выдать")
        }

    }
}






