package com.japnoor.datapass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.japnoor.datapass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("str", binding.etString.text.toString())
            intent.putExtra("inte", Integer.parseInt(binding.etInt.text.toString()))
            intent.putExtra("doub",binding.etDouble.text.toString().toDouble())
            intent.putExtra("flo", binding.etFloat.text.toString().toFloat())
            intent.putExtra("cha", binding.etChar.text.toString().first())
            intent.putExtra("bool",binding.etBool.text.toString().toBoolean())
            startActivity(intent)
        }
    }
}