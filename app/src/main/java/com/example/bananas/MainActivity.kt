package com.example.bananas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate : Button = findViewById(R.id.btn_start)

        btnNavigate.setOnClickListener { val myIntent= Intent(this,SignUp::class.java)
            startActivity(myIntent)
        }





    }
}