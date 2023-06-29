package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityBurgerBinding
import com.example.fooddeliveryapp.databinding.ActivityCartBinding
import com.example.fooddeliveryapp.databinding.ActivityMenuBinding
import com.example.fooddeliveryapp.databinding.ActivityWelcomeBinding

class Burger : AppCompatActivity() {
    lateinit var binding: ActivityBurgerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)
        binding= ActivityBurgerBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        binding.btnButton.setOnClickListener {
            val intent= Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}