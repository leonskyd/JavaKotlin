package com.example.javakotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            val title = binding.title.text.toString()
            val director = binding.director.text.toString()
            Repository.createObject(title,director)
            binding.textView.text = "$title by $director"
        }

        binding.button2.setOnClickListener {
            val berry = Cycling()
            berry.doIt()
        }
