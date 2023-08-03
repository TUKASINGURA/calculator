package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView=findViewById<ImageView>(R.id.image)
        val firstNumberEditText=findViewById<EditText>(R.id.first_number)
        val secondNumberEditText=findViewById<EditText>(R.id.second_number)


        val sumButton=findViewById<Button>(R.id.subtraction)
        val additionButton=findViewById<Button>(R.id.addition)
        val divisionButton=findViewById<Button>(R.id.division)
        val multiplicationButton=findViewById<Button>(R.id.multiplication)

        val answerText=findViewById<TextView>(R.id.answer)


//giving the buttons in the xml functionality
        additionButton.setOnClickListener{

            val firstNumber=firstNumberEditText.text.toString().toInt()
            val secondNumber=secondNumberEditText.text.toString().toDouble()
            val sum= firstNumber + secondNumber
            answerText.text="the sum is $sum"

            //either you can use this to display the same
            //answerText.getText=("the sum is $sum")
        }
        sumButton.setOnClickListener{

            val firstNumber=firstNumberEditText.text.toString().toInt()
            val secondNumber=secondNumberEditText.text.toString().toDouble()
            val sub= firstNumber - secondNumber
            answerText.text="the difference is $sub"
        }
        divisionButton.setOnClickListener{

            val firstNumber=firstNumberEditText.text.toString().toInt()
            val secondNumber=secondNumberEditText.text.toString().toDouble()
            val div= firstNumber / secondNumber
            answerText.text="the dividend is $div"

        }
        multiplicationButton.setOnClickListener{

            val firstNumber=firstNumberEditText.text.toString().toInt()
            val secondNumber=secondNumberEditText.text.toString().toDouble()
            val mult= firstNumber * secondNumber
            answerText.text="the product is $mult"

        }
//        // changing the image to another one on the display
//        answerText.setOnClickListener{
//            image.setImageResource(R.drawable.technology)
//        }

        // changing the image randomly from a set of image(array)
        answerText.setOnClickListener{
            val imageArray= arrayOf(R.drawable.computericons,R.drawable.technology,R.drawable.image,R.drawable.internet)
            imageView.setImageResource(imageArray.random())
        }

    }
}