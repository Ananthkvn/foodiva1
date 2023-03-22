package com.example.foodapp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.foodapp.R
import com.example.foodapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val backgroundAnim: ImageView = findViewById(R.id.iv_logo)
        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        backgroundAnim.startAnimation(sideAnimation)
//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        }, 3000)
        binding.startBtn.setOnClickListener {
            backgroundAnim.startAnimation(sideAnimation)
            Handler().post {
                startActivity(Intent(this, SignInPhoneActivity::class.java))
                finish()
            }
        }
        binding.googleBtn.setOnClickListener {
            backgroundAnim.startAnimation(sideAnimation)
            Handler().post {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}