package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val btnEnter = findViewById<Button>(R.id.btnEnter20)
        val etHeight = findViewById<EditText>(R.id.etHeight20)
        val tvResult = findViewById<TextView>(R.id.tvResult20)

        val longitudLista = 5
        val listaAltura = FloatArray(longitudLista)
        var sumaAltura = 0.0f
        var average = 0.0f
        var aboveAverage = 0
        var belowAverage = 0

        var index = 0
        btnEnter.setOnClickListener {
            val info = "Index: ${index+1}, altura: ${etHeight.text.toString().toFloat()}"
            tvResult.text = info
            listaAltura[index] = etHeight.text.toString().toFloat()
            if (index == longitudLista-1){
                for (altura in listaAltura){
                    sumaAltura += altura
                }
                average = getAverage(sumaAltura, longitudLista)
                belowAverage = getBelowAverageCount(average,listaAltura)
                aboveAverage = getAboveAverageCount(average,listaAltura)
                printResult(average, belowAverage, aboveAverage, tvResult)
            }
            index++
        }
    }

    private fun printResult(media: Float, bajoMedia: Int, sobreMedia: Int, tvResult: TextView) {
        val result = "La altura media es $media, por debajo $bajoMedia y por encima $sobreMedia"
        tvResult.text = result
    }

    private fun getAverage(sumaAltura:Float, longitudLista:Int):Float{
        return sumaAltura/longitudLista
    }

    private fun getBelowAverageCount(average:Float, heightList:FloatArray):Int{
        var underAverage = 0
        for (height in heightList){
            if (height<average)
                underAverage++
        }
        return underAverage
    }

    private fun getAboveAverageCount(average:Float, heightList:FloatArray):Int{
        var overAverage = 0
        for (height in heightList){
            if (height>average)
                overAverage++
        }
        return overAverage
    }
}