package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMastercardBinding
import com.example.fooddeliveryapp.databinding.ActivityPaymentBinding
import com.example.fooddeliveryapp.databinding.ActivityPaypalBinding

class Mastercard : AppCompatActivity() {
    lateinit var binding: ActivityMastercardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mastercard)
        binding= ActivityMastercardBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
        }
        binding.btnPay.setOnClickListener {
            val intent= Intent(this, Paypal::class.java)
            startActivity(intent)
        }
    }
}