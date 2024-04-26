package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityConversorBinding

class Converter : AppCompatActivity() {
    private lateinit var binding: ActivityConversorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConversorBinding.inflate(layoutInflater)
        setContentView(binding.root)
val intent = Intent(this, ConversorReal::class.java)

        binding.bt.setOnClickListener {
            startActivity(intent)
        }
        val intentDolar = Intent(this, ConversorDolar::class.java)
        binding.bts.setOnClickListener {
            startActivity(intentDolar)
        }
    }
}