package com.example.ejemplostiposclase

import android.os.Build
import android.os.Bundle
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Cogemos el id del RadioGroup
        var radiogroup = findViewById<RadioGroup>(R.id.radioGroup)
        //Creamos un setOnCheckedChangeListener que nos pedirá el radioGroup que hemos guardado
        //Anteriormente y checkedId que es una variable definida por android studio
        radiogroup.setOnCheckedChangeListener{radioGroup,checkedId ->
            //Coges el id del panel principal que quieres cambiar de color, Esta asi en el xml--> android:id="@+id/main"
            val mainLayout = findViewById<ConstraintLayout>(R.id.main)

            when (checkedId) {
                R.id.RbRojo -> {
                    val colorRojo:Int = Vcolor.ROJO.retornarColor()
                    mainLayout.setBackgroundColor(colorRojo)
                }
                R.id.RbAzul -> {
                    val colorAzul:Int = Vcolor.AZUL.retornarColor()
                    mainLayout.setBackgroundColor(colorAzul)
                }
                R.id.RbVerde -> {
                    val colorVerde:Int = Vcolor.VERDE.retornarColor()
                    mainLayout.setBackgroundColor(colorVerde)
                }
                R.id.RbNegro -> {
                    val colorNegro:Int = Vcolor.NEGRO.retornarColor()
                    mainLayout.setBackgroundColor(colorNegro)
                }
            }
        }
    }
}