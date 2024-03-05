package com.example.bananas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

import kotlin.collections.ArrayList

class SignUp : AppCompatActivity() {






    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode", "SuspiciousIndentation")
    //Using a suppression  . I18" stands for "Internationalization
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val userList = mutableListOf<User>()

        val tvSignUp: TextView = findViewById(R.id.tv_signup)
        val emailInput: EditText = findViewById(R.id.edt_email)
        val passwordInput: EditText= findViewById(R.id.edt_password)
        val btnSignUp:Button= findViewById(R.id.btn_signup)
       val swRememberUser:Switch=findViewById(R.id.sw_remember_me)


         btnSignUp.setOnClickListener {
             val userEmail = emailInput.text.toString()
             val userPassword = passwordInput.text.toString()
             val rememberMe = swRememberUser.isChecked

             if (userEmail.isNotEmpty() && userPassword.isNotEmpty()) {
                val user = User(userEmail,userPassword,rememberMe)
                 userList.add(user)
                 val myIntent= Intent(this,LogIn::class.java)
                     myIntent.putExtra("userList",ArrayList(userList))
                 startActivity(myIntent)
             } else {
                 tvSignUp.text="Please enter both email and password"
             }

         }




    }
}