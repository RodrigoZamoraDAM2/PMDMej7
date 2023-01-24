package com.example.pmdmej7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ladron.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.ladron)
        }
        binding.berserker.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.berserker)
        }
        binding.mago.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.mago)
        }
        binding.guerrero.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.guerrero)
        }
        binding.arquero.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.arquero)
        }
        binding.mercader.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.mercader)
        }
        binding.aceptar.setOnClickListener(){
            val intent = Intent(this@MainActivity,BlankActivity::class.java)
            startActivity(intent)
        }
    }
}