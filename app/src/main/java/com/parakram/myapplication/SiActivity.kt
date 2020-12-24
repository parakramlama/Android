//package com.parakram.myapplication
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class SiActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_si)
//    }
//}


package com.parakram.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SiActivity : AppCompatActivity() {

    private lateinit var etPrincipal: EditText
    private lateinit var etTime: EditText
    private lateinit var etRate: EditText
    private lateinit var btnCal: EditText
    private lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        etPrincipal = findViewById(R.id.etPrincipal)
        etTime = findViewById(R.id.etTime)
        etRate = findViewById(R.id.etRate)
        btnCal = findViewById(R.id.btnCal)
        tvResult = findViewById(R.id.tvResult)

        btnCal.setOnClickListener {
            calSi()
        }
    }

    private fun calSi() {
        val principal: Float = etPrincipal.text.toString().toFloat()
        val time: Float = etTime.text.toString().toFloat()
        val rate: Float = etRate.text.toString().toFloat()

        simpleIntrest(principal, time, rate)

//        val SI = simpleIntrest(principal,time,rate)
//        val SI : Float = simpleIntrest(principal,time,rate)
//        tvResult.text = SI.toString()
//        Toast.makeText(this, "Si is $SI", Toast.LENGTH_LONG).show()
    }

    private fun simpleIntrest(principal: Float, time: Float, rate: Float) {
        val result = (principal * time * rate) / 100
        tvResult.text = result.toString()

//        val si = (principal*time*rate)/100
//        return si
    }
}