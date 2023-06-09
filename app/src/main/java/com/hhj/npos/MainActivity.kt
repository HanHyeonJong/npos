package com.hhj.npos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hhj.npos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //뷰바인딩
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}