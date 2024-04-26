package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityRealBinding

class ConversorReal : AppCompatActivity() {

    private lateinit var binding: ActivityRealBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRealBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoreal.setOnClickListener {
            if (binding.dolar.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Digite um valor", Toast.LENGTH_SHORT).show()
            } else {
                val real: Float = binding.dolar.text.toString().toFloat()
                val dolar: Double = real / 4.54;
                Toast.makeText(applicationContext, "O valor em dolares é US$ " + dolar.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnvoltar.setOnClickListener{
            startActivity(Intent(this, Converter::class.java))
        }

    }
}