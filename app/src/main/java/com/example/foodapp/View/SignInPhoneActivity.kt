package com.example.foodapp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivitySignInPhoneBinding

class SignInPhoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verifyBtn.setOnClickListener {
            startActivity(Intent(this, VerifyOtpActivity::class.java))
        }
    }
}