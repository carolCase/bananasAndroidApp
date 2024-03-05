package com.example.bananas

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    private lateinit var mp: MediaPlayer;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate : Button = findViewById(R.id.btn_start)

         mp = MediaPlayer.create(this, R.raw.applause)
        mp.start()

        btnNavigate.setOnClickListener { val myIntent= Intent(this,SignUp::class.java)
            startActivity(myIntent)
        }





    }
}