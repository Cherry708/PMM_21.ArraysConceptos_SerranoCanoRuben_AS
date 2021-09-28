package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.IndexOutOfBoundsException

class ProblemaPropuesto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto2)

        val etNumber0 = findViewById<EditText>(R.id.etNumber70)
        val tvResult = findViewById<TextView>(R.id.tvResult70)

        val integerList0 = IntArray(4)
        val integerList1 = IntArray(4)
        val integerListAddition = IntArray(4)

        val btnEnter = findViewById<Button>(R.id.btnEnter70)
        var listIndex = 0
        btnEnter.setOnClickListener {
            try{
                if (listIndex in 0..3){
                    integerList0[listIndex] = etNumber0.text.toString().toInt()

                } else
                    integerList1[listIndex - 4] = etNumber0.text.toString().toInt()

                for (i in integerListAddition.indices){
                    integerListAddition[i] = integerList0[i]+integerList1[i]
                }

                val result = integerListAddition.toList().toString()
                listIndex++
                tvResult.text = result
            }catch (e: IndexOutOfBoundsException){}
        }
    }
}