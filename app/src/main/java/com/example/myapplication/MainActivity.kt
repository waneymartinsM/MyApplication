package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ActivityMainBinding: classe criada para ajudar a mapear os elementos;
        //inflate: pega o layout e infle, aumente, expande para pegar os elementos da interface;
        //layoutInflater: variavel veio do AppCompatActivity(defini uma classe Activity);

    }

    private fun calculate(){

    }
}