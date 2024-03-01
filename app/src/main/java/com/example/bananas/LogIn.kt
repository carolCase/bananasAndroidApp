package com.example.bananas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LogIn : AppCompatActivity() {
    private lateinit var userList: List<User>

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        userList = intent.getSerializableExtra("userList") as? List<User> ?: emptyList()


        val tvLogIn: TextView = findViewById(R.id.tv_login)
        val etLoginUserEmail: EditText = findViewById(R.id.et_loginuseremail)
        val etLoginPassword: EditText = findViewById(R.id.et_loginpassword)
        val btnLogIn: Button = findViewById(R.id.btn_login)


        btnLogIn.setOnClickListener {
            val userEmail = etLoginUserEmail.text.toString()
            val user = userList.find {it.email==userEmail}


            if (user!=null){
                val myIntent = Intent(this,About::class.java)
                startActivity(myIntent)

            }else{
                tvLogIn.text="User does not exist, enter a valid user"
            }
        }








    }
}