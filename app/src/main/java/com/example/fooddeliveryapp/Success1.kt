package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMastercardBinding
import com.example.fooddeliveryapp.databinding.ActivitySuccess1Binding
import com.example.fooddeliveryapp.databinding.ActivityUnsuccessfulBinding

class Success1 : AppCompatActivity() {
    lateinit var binding: ActivitySuccess1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success1)
        binding= ActivitySuccess1Binding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Paypal::class.java)
            startActivity(intent)
        }
        binding.btnTry.setOnClickListener {
            val intent= Intent(this, Unsuccessful::class.java)
            startActivity(intent)
        }
    }

}