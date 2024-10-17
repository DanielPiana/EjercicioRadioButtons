package com.example.ejemplostiposclase

import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

enum class Vcolor(var num_color:Int,var nombre_color:String) {
    ROJO(1,"RED"),
    AZUL(2,"BLUE"),
    VERDE(3,"GREEN"),
    NEGRO(4,"BLACK");
    @RequiresApi(Build.VERSION_CODES.O)
    //He hecho que la funcion devuelva directamente un valor predefinido por Android que es un Int
    fun retornarColor(): Int {
         return when(this) {
             ROJO->Color.RED
             AZUL->Color.BLUE
             VERDE->Color.GREEN
             NEGRO->Color.BLACK
         }
    }
}