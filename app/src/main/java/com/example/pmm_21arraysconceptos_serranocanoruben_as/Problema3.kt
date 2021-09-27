package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.IndexOutOfBoundsException

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val etNumber1 = findViewById<EditText>(R.id.etNumber31)
        val tvResult = findViewById<TextView>(R.id.tvResult30)
        val userInputs = 5
        val listaEnteros = IntArray(userInputs)


        val btnEnter = findViewById<Button>(R.id.btnEnter30)
        var index = 0
        btnEnter.setOnClickListener {
            listaEnteros[index] = etNumber1.text.toString().toInt()
            val info = "Index: ${index+1}, entero: ${etNumber1.text.toString().toInt()}"
            tvResult.text = info
            if (index == userInputs-1){
                tvResult.text = message(isConsecutiveIntegers(listaEnteros))
                    .plus(" "+listaEnteros.toList().toString())
            }
            index++

        }
    }
    private fun isConsecutiveIntegers(integerList:IntArray):Boolean{
        var isConsecutive = false
        for (i in integerList.indices){
            try {
                if (integerList[i] < integerList[i+1]){
                    isConsecutive = true
                }
            } catch (e: IndexOutOfBoundsException){}
        }
        return isConsecutive
    }

    private  fun message(isConsecutive:Boolean):String{
        return if (isConsecutive){
            "La lista es consecutiva"
        } else "La lista no es consecutiva"
    }
}