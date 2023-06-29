package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMastercardBinding
import com.example.fooddeliveryapp.databinding.ActivityTrackBinding
import com.example.fooddeliveryapp.databinding.ActivityUnsuccessfulBinding

class Unsuccessful : AppCompatActivity() {
    lateinit var binding: ActivityUnsuccessfulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unsuccessful)
        binding= ActivityUnsuccessfulBinding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this,Success1::class.java)
            startActivity(intent)
        }
        binding.btnTrack.setOnClickListener {
            val intent= Intent(this, Track::class.java)
            startActivity(intent)
        }
    }
}