package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMastercardBinding
import com.example.fooddeliveryapp.databinding.ActivityPaypalBinding
import com.example.fooddeliveryapp.databinding.ActivitySuccess1Binding

class Paypal : AppCompatActivity() {
    lateinit var binding: ActivityPaypalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paypal)
        binding= ActivityPaypalBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Mastercard::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent= Intent(this, Success1::class.java)
            startActivity(intent)
        }
    }
}