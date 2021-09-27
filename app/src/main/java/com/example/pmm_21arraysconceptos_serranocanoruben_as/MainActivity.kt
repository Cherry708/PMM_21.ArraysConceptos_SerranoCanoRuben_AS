package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnter = findViewById<Button>(R.id.btnEnter10)
        val etWage = findViewById<EditText>(R.id.etWage10)
        val tvResult = findViewById<TextView>(R.id.tvResult10)
        val wageList = IntArray(5)

        var wageAddition = 0
        var index = 0
        if (btnEnter.isPressed)
            index++
        btnEnter.setOnClickListener {
            val wage = etWage.text.toString().toInt()
            wageList[index] = wage
            for (e in wageList)
                wageAddition += e
            tvResult.text = wageAddition.toString()
        }

    }
}