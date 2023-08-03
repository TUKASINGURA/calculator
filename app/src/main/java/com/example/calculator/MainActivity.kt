package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cal_layout)

        val image=findViewById<ImageView>(R.id.image)
        val firstNumberEditText=findViewById<TextInputEditText>(R.id.first_number)
        val secondNumberEditText=findViewById<TextInputEditText>(R.id.second_number)


        val sumButton=findViewById<Button>(R.id.subtraction)
        val additionButton=findViewById<Button>(R.id.addition)
        val divisionButton=findViewById<Button>(R.id.division)
        val multiplicationButton=findViewById<Button>(R.id.multiplication)

        val answerText=findViewById<TextView>(R.id.answer)

        val firstNumber=firstNumberEditText.text.toString().toInt()
        val secondNumber=secondNumberEditText.text.toString().toDouble()


        additionButton.setOnClickListener{
            val sum= firstNumber + secondNumber
            answerText.setText("the sum is $sum")

            //either you can use this to display the same
            //answerText.text="the sum is $sum"
        }
        // changing the image to another one on the display
        answerText.setOnClickListener{
            image.setImageResource(R.drawable.technology)
        }
    }
}