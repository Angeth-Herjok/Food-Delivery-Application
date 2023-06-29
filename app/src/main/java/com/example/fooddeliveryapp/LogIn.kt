package com.example.fooddeliveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Toast
import com.example.fooddeliveryapp.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validateLogin()
    }

override fun onResume() {
    super.onResume()
    setContentView(binding.root)
    binding.tvbutton6.setOnClickListener {
        val intent= Intent(this,SignUp::class.java)
        startActivity(intent)
    }
    binding.tvLogin.setOnClickListener {
        val intent= Intent(this,welcome::class.java)
        startActivity(intent)
    }

}


    fun validateLogin() {


        val firstName = binding.etEmail.text.toString()
        val lastName = binding.etPassword.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
//        val passwordConfirmation = binding.etPasswordConfirmation.text.toString()
        var error=false

        if (firstName.isBlank()) {
            binding.tilEmail.error = "Valid email required"
            error=true
        }
        if (lastName.isBlank()) {
            binding.tilPassword.error = "Correct password required"
            error=true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Valid email required"
            error=true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Correct password required"
            error=true
        }
//        if (passwordConfirmation.isBlank()) {
//            binding.tilpasswordConfirmation.error = "first name required"
//            error=true
//        }
//        if (password!=passwordConfirmation){
//            binding.tilpasswordConfirmation.error="password confirmation does not match password"
//            error=true
//        }
        if (!error){
            Toast.makeText(this,"$email $password", Toast.LENGTH_LONG).show()
        }
    }
    fun clearErrors(){
        binding.tilPassword.error=null
        binding.tilEmail.error=null
        binding.tilPassword.error=null
        binding.tilEmail.error=null

    }

}