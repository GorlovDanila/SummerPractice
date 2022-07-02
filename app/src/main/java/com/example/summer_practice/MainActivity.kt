package com.example.summer_practice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button? = findViewById(R.id.button)

        button?.setOnClickListener{
            calculation()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculation() {
        val name: EditText? = findViewById(R.id.et_person_name)
        val weight: EditText? = findViewById(R.id.et_person_weight)
        val height: EditText? = findViewById(R.id.et_person_height)
        val age: EditText? = findViewById(R.id.et_person_age)
        val result: TextView = findViewById(R.id.tv_result)

        try {
            if((name == null) || (weight == null) || (height == null) || (age == null) || (name.text.length > 50) || (height.text.toString()
                    .toInt() !in (1..249)) || (weight.text.toString()
                    .toDouble() !in (1.0..249.0)) || (age.text.toString().toInt() !in (1..149))
            ){
                result.text = "Данные введены некорректно"
            } else {
                val res: Double =
                    88.36 + (13.4 * weight.text.toString().toDouble()) + (4.8 * height.text.toString()
                        .toInt()) - (5.7 * age.text.toString().toInt()) + name.text.length
                result.text = "Ответ: ${res.toInt()}"
            }
        } catch (e: Exception){
            result.text = "Данные введены некорректно"
        }
    }
}
