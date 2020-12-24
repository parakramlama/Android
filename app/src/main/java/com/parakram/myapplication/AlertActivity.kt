package com.parakram.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("my Alert")
            //set message for alert dialog
            builder.setMessage("Are you sure ?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("Yes"){_,_->
                Toast.makeText(this, "clicked yes", Toast.LENGTH_LONG).show()
            }

            //performing cancel action
            builder.setNeutralButton("Cancel"){_,_->
                Toast.makeText(
                    applicationContext,
                    "clicked cancel\n operation cancel",
                    Toast.LENGTH_LONG
                ).show()
            }
            //performing negative action
            builder.setNegativeButton("No"){ _, _ ->
                Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
            }
            //create the alertdialog
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}