package com.example.foodapp.View

import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.R
import com.example.foodapp.databinding.ActivityVerifyOtpBinding

class VerifyOtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val paints = binding.mobilenosubtextTv.paint
//        val width = paints.measureText(binding.mobilenosubtextTv.toString())
        binding.mobilenosubtextTv.setTextColor(resources.getColor(R.color.radiantStartGreen))
        val textShader: Shader = LinearGradient(
            0f,
            binding.mobilenosubtextTv.paint.measureText(binding.mobilenosubtextTv.text.toString()),
            0f,
            0f,
            intArrayOf(
                resources.getColor(R.color.radiantStartGreen),
                resources.getColor(R.color.radiantEndGreen)
            ),
            floatArrayOf(0f, 1f),
            Shader.TileMode.CLAMP
        )
        binding.mobilenosubtextTv.paint.shader = textShader
    }
}