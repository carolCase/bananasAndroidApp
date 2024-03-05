package com.example.bananas

import java.io.Serializable

data class User(val email:String,val password:String, val rememberMe:Boolean) : Serializable
