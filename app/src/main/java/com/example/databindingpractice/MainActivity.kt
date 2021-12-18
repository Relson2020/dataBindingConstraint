package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val email =binding.emailEditTextId
        val password = binding.passwordEditTextId

        binding.buttonId.setOnClickListener{
             Toast.makeText(this,"$email $password",Toast.LENGTH_SHORT).show()
        }
    }
}