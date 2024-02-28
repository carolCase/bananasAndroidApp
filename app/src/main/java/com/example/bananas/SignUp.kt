package com.example.bananas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUp : AppCompatActivity() {

    private val userList: MutableList<User> = mutableListOf()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val tvSignUp: TextView = findViewById(R.id.tv_signup)
        val emailInput: EditText = findViewById(R.id.edt_email)
        val passwordInput: EditText= findViewById(R.id.edt_password)
        val btnSignUp:Button= findViewById(R.id.btn_signup)


         btnSignUp.setOnClickListener {
             val userEmail = emailInput.text.toString()
             val userPassword = passwordInput.text.toString()

             if (userEmail.isNotEmpty() && userPassword.isNotEmpty()) {
                 val newUser = User(userEmail,userPassword)
                 userList.add(newUser)
                 val myIntent= Intent(this,LoggedIn::class.java)
                 startActivity(myIntent)
             } else {
                 tvSignUp.text="Please enter both email and password"
             }



         }




    }
}