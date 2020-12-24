package com.parakram.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class RadiobuttonActivity : AppCompatActivity() {

    private lateinit var etFirst : EditText
    private lateinit var etSecond : EditText
    private lateinit var rdoAdd : RadioButton
    private lateinit var rdoSubtract : RadioButton
    private lateinit var rdoMultiply : RadioButton
    private lateinit var btnCalculate : EditText
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radiobutton)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        rdoAdd = findViewById(R.id.rdoAdd)
        rdoSubtract = findViewById(R.id.rdoSubtract)
        rdoMultiply = findViewById(R.id.rdoMultiply)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            //validation
            if (!TextUtils.isEmpty(etFirst.text)) {
                if(TextUtils.isEmpty(etSecond.text)){
                    etSecond.error = "Please enter second number"
                    etSecond.requestFocus()
                    return@setOnClickListener
                }
            } else {
                etFirst.error = "Please enter first number"
                etFirst.requestFocus()
                return@setOnClickListener
            }
            addNos()
        }
    }
    private fun addNos(){
        val first : Int = etFirst.text.toString().toInt()
        val second : Int = etSecond.text.toString().toInt()
        var result : Int = 0
        if(rdoAdd.isChecked){
            result = first + second
        }
        else if(rdoSubtract.isChecked){
            result = first - second
        }
        else if(rdoMultiply.isChecked){
            result = first * second
        }
        tvResult.visibility = View.VISIBLE
        tvResult.text = result.toString()
    }
}