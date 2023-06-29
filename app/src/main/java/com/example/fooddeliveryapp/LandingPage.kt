package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding:ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        binding= ActivityLandingPageBinding.inflate(layoutInflater)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
            binding.btnSignUp.setOnClickListener {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }

        }
//    override fun onResume() {
//        super.onResume()
//        setContentView(binding.root)
//        binding.btnSignUp.setOnClickListener {
//            val intent= Intent(this,SignUp::class.java)
//            startActivity(intent)
//        }
//
//    }
    }
}