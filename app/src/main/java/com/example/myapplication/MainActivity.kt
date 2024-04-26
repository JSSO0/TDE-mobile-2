package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

       val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var username = "admin"
            var password = "admin"

            var usernameInput: String = binding.nome.text.toString()
            var passwordInput: String = binding.senha.text.toString()
val intentConverter = Intent(this, Converter::class.java)
           if(username == usernameInput && password == passwordInput){
               startActivity(intentConverter)
           }
        }
        super.onCreate(savedInstanceState)
      }
    }