package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.IndexOutOfBoundsException

class Problema4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema4)

        val etNumber0 = findViewById<EditText>(R.id.etNumber40)
        val tvResult = findViewById<TextView>(R.id.tvResult40)

        val integerList = IntArray(5)

        val btnEnter = findViewById<Button>(R.id.btnEnter40)
        var integerListIndex = 0
        btnEnter.setOnClickListener {
            try{
            integerList[integerListIndex] = etNumber0.text.toString().toInt()
            val info = "Index: ${integerListIndex + 1}, Integer: ${etNumber0.text.toString().toInt()}"
            tvResult.text = info

            if (integerListIndex == integerList.size-1){
                val result = "First index: ${integerList.first()}, Last index: " +
                        "${integerList.get(integerList.lastIndex)}"
                tvResult.text = info.plus(" "+result)
            }
            integerListIndex++
            }catch (e:IndexOutOfBoundsException){}
        }
    }
}