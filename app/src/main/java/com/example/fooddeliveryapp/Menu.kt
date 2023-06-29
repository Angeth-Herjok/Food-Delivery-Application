package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMenuBinding
import com.example.fooddeliveryapp.databinding.ActivityWelcomeBinding

class Menu : AppCompatActivity() {
    lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        binding= ActivityMenuBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent=Intent(this,welcome::class.java)
            startActivity(intent)
        }
        binding.ivArrow1.setOnClickListener {
            val intent=Intent(this,Burger::class.java)
            startActivity(intent)
        }
    }
}