package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityConvertdBinding

class ConversorDolar : AppCompatActivity() {

    private lateinit var binding: ActivityConvertdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConvertdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoreal.setOnClickListener {
            if (binding.real.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Digite um valor para converter", Toast.LENGTH_SHORT).show()
            } else {
                val dolar: Float = binding.real.text.toString().toFloat()
                val real: Double = dolar * 4.99;
                Toast.makeText(applicationContext, "O valor convertido é R$" + real.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding.voltar.setOnClickListener{
            startActivity(Intent(this, Converter::class.java))
        }
    }
}