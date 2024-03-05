@file:Suppress("DEPRECATION")

package com.example.bananas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LogIn : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val userList = intent.getSerializableExtra("userList") as List<User>


        val tvLogIn: TextView = findViewById(R.id.tv_login)
        val etLoginUserEmail: EditText = findViewById(R.id.et_loginuseremail)
        val etLoginPassword: EditText = findViewById(R.id.et_loginpassword)
        val btnLogIn: Button = findViewById(R.id.btn_login)


        btnLogIn.setOnClickListener {
            val userPassword= etLoginPassword.text.toString()
            val userEmail = etLoginUserEmail.text.toString()
            val user = userList.find {it.email==userEmail && it.password==userPassword}


            if (user!=null){
                val myIntent = Intent(this,About::class.java)
                myIntent.putExtra("user", user)
                startActivity(myIntent)

            }else{
                tvLogIn.text="User does not exist, enter a valid user"
            }
        }








    }
}