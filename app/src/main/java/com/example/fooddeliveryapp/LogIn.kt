package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_log_in)
    }

override fun onResume() {
    super.onResume()
    setContentView(binding.root)
    binding.tvLogin.setOnClickListener {
        val intent= Intent(this,SignUp::class.java)
        startActivity(intent)
    }

}


}