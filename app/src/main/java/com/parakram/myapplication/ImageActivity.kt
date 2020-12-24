package com.parakram.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {

    private lateinit var rdoDayahang : RadioButton
    private lateinit var rdoJohn : RadioButton
    private lateinit var rdoHarry : RadioButton
    private lateinit var imgProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rdoDayahang = findViewById(R.id.rdoDayahang)
        rdoJohn = findViewById(R.id.rdoJohn)
        rdoHarry = findViewById(R.id.rdoHarry)

        rdoDayahang.setOnClickListener{
            imgProfile.setImageResource(R.drawable.dayahang)
        }
        rdoJohn.setOnClickListener{
            imgProfile.setImageResource(R.drawable.john)
        }
        rdoHarry.setOnClickListener{
            imgProfile.setImageResource(R.drawable.harry)
        }

//        if(rdoDayahang.isCheckedd){
//            imgProfile.setImageResource(R.drawable.dayahang)
//
//        }else if(rdoJohn.isChecked){
//            imgProfile.setImageResource(R.drawable.john)
//
//        }else if(rdoHarry.isChecked){
//            imgProfile.setImageResource(R.drawable.harry )
//        }
    }
}