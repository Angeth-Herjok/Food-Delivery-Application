package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed
import com.example.fooddeliveryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.hide()
        Handler().postDelayed({
                              val intent=Intent(this@MainActivity,LandingPage::class.java)
            startActivity(intent)
        },3000)
    }

//    override fun onResume() {
//        super.onResume()
//        setContentView(binding.root)
//        binding.tvName.setOnClickListener {
//            val intent=Intent(this,LandingPage::class.java)
//            startActivity(intent)
//
//
//        }
//
//    }
   

}
