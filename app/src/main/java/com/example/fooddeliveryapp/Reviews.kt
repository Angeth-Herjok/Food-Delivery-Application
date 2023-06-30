package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityPaymentBinding
import com.example.fooddeliveryapp.databinding.ActivityReviewsBinding
import kotlin.collections.Map

class Reviews : AppCompatActivity() {
    lateinit var binding: ActivityReviewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)
        binding= ActivityReviewsBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this, Track::class.java)
            startActivity(intent)
        }
        binding.ivArrow1.setOnClickListener {
            val intent= Intent(this, Menu2::class.java)
            startActivity(intent)
        }
    }
}