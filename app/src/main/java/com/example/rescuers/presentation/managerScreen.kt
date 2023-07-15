package com.example.rescuers.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rescuers.data.ScoutListClass
import kotlin.reflect.KClass

val smirnov:ScoutListClass = ScoutListClass(" Максим ","Смирнов","скор")
val kotov:ScoutListClass = ScoutListClass(" Владимир ","Котов","итсист")
val romanova:ScoutListClass = ScoutListClass(" Виктория ","Романова","гигант")
val jakovleva:ScoutListClass = ScoutListClass("Агата ","Яковлева","шахман")
val holov:ScoutListClass = ScoutListClass(" Артём ","Хохлов","азан")
val konstantinov:ScoutListClass = ScoutListClass(" Никита ","Константинов","Торн")
val eremina:ScoutListClass = ScoutListClass(" Екатерина ","Еремина","хаммер")
val goncharova:ScoutListClass = ScoutListClass(" Анастасия","Гончарова","Раскольников")
val semenov:ScoutListClass = ScoutListClass(" Александр","Семенов","якер")
val dmitrieva:ScoutListClass = ScoutListClass(" София ","Дмитриева","Хармонт")




val scoutListForExample = mutableListOf<ScoutListClass>(
    smirnov,
    kotov,
    romanova,
    jakovleva,
    holov,
    konstantinov,
    eremina,
    goncharova,
    semenov,
    dmitrieva
   )




@Preview
@Composable
fun mangerScreen(){
  LazyColumn(modifier = Modifier.fillMaxSize()){
      for (0 until scoutListForExample.size)

  }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScoutItem(firsName:String = "Иван", lastName:String = "Иванов", callSign:String = "Ворон"){
    var itemClicked = remember {
        mutableStateOf(false)
    }

    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        onClick = {itemClicked.value = !itemClicked.value}
            ) {
        Row() {
            Text(text = firsName,
                    fontSize = (30.sp),
                    color = Color.DarkGray)
        }
        Row() {
            Text(text = lastName,
                fontSize = (30.sp),
                color = Color.DarkGray)
        }
        Row() {
            Text(text = callSign,
                fontSize = (30.sp),
                color = Color.DarkGray)
        }

    if (itemClicked.value == true){
buttonPanel()

    }
}

    }


@Preview
@Composable
fun buttonPanel(){
    Row() {
        Button(modifier = Modifier
            .fillMaxWidth(0.5F)
            .padding(16.dp),
            onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(MySquadBlueColor)) {
            Text(text = "Выдано:")
        }
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(MySquadBlueColor)) {
            Text(text = "Выдать")
        }

    }
}






