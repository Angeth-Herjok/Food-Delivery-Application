package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliveryapp.databinding.ActivityMenu2Binding
import com.example.fooddeliveryapp.databinding.ActivityReviewsBinding
import kotlin.collections.Map

class Menu2 : AppCompatActivity() {
    lateinit var binding: ActivityMenu2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        binding= ActivityMenu2Binding.inflate(layoutInflater)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.ivArrow.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnSearch.setOnClickListener {
            val intent= Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}