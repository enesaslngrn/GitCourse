package com.example.gitcourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gitcourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        println("İlk değişikliği yapıyorum!")
        println("İkinci değişiklik")
        println("başka biri bu kodu değiştirdi")
        println("başka biri bu kodu ekledi")
    }
}