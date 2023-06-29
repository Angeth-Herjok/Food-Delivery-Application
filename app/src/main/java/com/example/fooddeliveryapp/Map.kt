package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMainBinding
import com.example.fooddeliveryapp.databinding.ActivityMapBinding
import com.example.fooddeliveryapp.databinding.ActivityPaymentBinding
import com.example.fooddeliveryapp.databinding.ActivityReviewsBinding
import com.example.fooddeliveryapp.databinding.ActivityUnsuccessfulBinding

class Map : AppCompatActivity() {
    lateinit var binding: ActivityMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        binding= ActivityMapBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Cart::class.java)
            startActivity(intent)
        }
        binding.btnCheck.setOnClickListener {
            val intent= Intent(this, Payment::class.java)
            startActivity(intent)
        }
    }
}