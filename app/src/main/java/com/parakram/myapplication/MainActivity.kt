package com.parakram.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //global variable
    //lateinit can only be used in complex datatype
    private lateinit var etFirst : EditText
    private lateinit var etSecond : EditText
    private lateinit var btnCalculate : EditText
    private lateinit var btnSubtraction : EditText
    private lateinit var btnMultiplication : EditText
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //reference/binding
        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            addTwoNos()
        }

        btnMultiplication.setOnClickListener {
            multiplyTwoNos()
        }
        btnSubtraction.setOnClickListener {
            subtractTwoNos()
        }
    }

    private fun subtractTwoNos() {
        val first : Int = etFirst.text.toString().toInt()
        val second : Int = etSecond.text.toString().toInt()
        mulAnother(first,second)
    }

    private fun multiplyTwoNos(){
        val first : Int = etFirst.text.toString().toInt()
        val second : Int = etSecond.text.toString().toInt()
        subAnother(first,second)
    }


    private  fun addTwoNos(){
        //extract value
        val first : Int = etFirst.text.toString().toInt()
        val second : Int = etSecond.text.toString().toInt()
        addAnother(first,second)

//        val sum = add(first,second)
//        tvResult.text = sum.toString()
//        Toast.makeText(this, "Sum is $sum", Toast.LENGTH_LONG).show()
    }

    //function with return type
//    private fun add(first:Int, second:Int): Int{
//        return first + second
//    }

    private fun addAnother(first: Int,second: Int){
        val result = first + second
        tvResult.text = result.toString()
    }

    private fun subAnother(first: Int,second: Int){
        val result = first - second
        tvResult.text = result.toString()
    }

    private fun mulAnother(first: Int,second: Int){
        val result = first * second
        tvResult.text = result.toString()
    }
    
}