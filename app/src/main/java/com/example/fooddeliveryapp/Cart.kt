package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityBurgerBinding
import com.example.fooddeliveryapp.databinding.ActivityCartBinding
import com.example.fooddeliveryapp.databinding.ActivityMapBinding
import com.example.fooddeliveryapp.databinding.ActivityPaymentBinding

class Cart : AppCompatActivity() {
    lateinit var binding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        binding= ActivityCartBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this, Burger::class.java)
            startActivity(intent)
        }
        binding.tvNext.setOnClickListener {
            val intent= Intent(this, Payment::class.java)
            startActivity(intent)
        }
    }
}