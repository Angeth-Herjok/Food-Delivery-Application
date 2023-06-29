package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityReviewsBinding
import com.example.fooddeliveryapp.databinding.ActivitySuccess1Binding
import com.example.fooddeliveryapp.databinding.ActivityUnsuccessfulBinding

class Track : AppCompatActivity() {
    lateinit var binding: ActivityUnsuccessfulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track)
        binding= ActivityUnsuccessfulBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Unsuccessful::class.java)
            startActivity(intent)
        }
        binding.btnTrack.setOnClickListener {
            val intent= Intent(this, Reviews::class.java)
            startActivity(intent)
        }
    }
}