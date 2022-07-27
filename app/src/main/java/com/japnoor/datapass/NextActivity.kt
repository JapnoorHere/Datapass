package com.japnoor.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.japnoor.datapass.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    lateinit var binding : ActivityNextBinding
    var str: String = ""
    var inte : Int=0
    var doub : Double=0.0
    var flo : Float=0.0f
    var cha : Char='a'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent?.let {
            if(it.hasExtra("str"))
            str=it.getStringExtra("str") as String
            if(it.hasExtra("inte"))
            inte=it.getIntExtra("inte",0)
            if(it.hasExtra("doub"))
            doub=it.getDoubleExtra("doub",0.0)
            if(it.hasExtra("flo"))
                flo=it.getFloatExtra("flo",0.0f)
            if(it.hasExtra("cha"))
                cha=it.getCharExtra("char",'a')
        }?:kotlin.run {  }

        binding.tvString1.setText(str)
        binding.tvInt1.setText(inte.toString())
        binding.tvDouble1.setText(doub.toString())
        binding.tvFloat1.setText(flo.toString())
        binding.tvChar1.setText(cha.toString())
    }
}