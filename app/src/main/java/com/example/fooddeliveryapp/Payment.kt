package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityBurgerBinding
import com.example.fooddeliveryapp.databinding.ActivityMastercardBinding
import com.example.fooddeliveryapp.databinding.ActivityPaymentBinding

class Payment : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        binding= ActivityPaymentBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Map::class.java)
            startActivity(intent)
        }
        binding.btnPay.setOnClickListener {
            val intent= Intent(this, Mastercard::class.java)
            startActivity(intent)
        }
    }
}