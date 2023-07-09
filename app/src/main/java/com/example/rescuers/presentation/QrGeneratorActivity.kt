package com.example.rescuers.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import com.example.rescuers.R

class QrGeneratorActivity : AppCompatActivity() {
    var im: ImageView? = null
    lateinit var bGenerate: Button
    var firstName: EditText? = null
    var secondName: EditText? = null
    var callSign: EditText? = null
    var haveACar: RadioButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_generator)
        im = findViewById(R.id.QRView)
        bGenerate = findViewById(R.id.GenerateQrBtn)
        firstName = findViewById(R.id.firstNameET)
        secondName = findViewById(R.id.secondNameET)
        callSign = findViewById(R.id.callSignET)
        haveACar = findViewById(R.id.haveACarRB)

        bGenerate.setOnClickListener {


        }
    }
private fun generateQrCode(text:String){



}

}
