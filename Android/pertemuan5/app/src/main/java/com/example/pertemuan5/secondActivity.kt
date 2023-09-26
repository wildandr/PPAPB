package com.example.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan5.MainActivity.Companion.EXTRA_NAME
import com.example.pertemuan5.databinding.ActivitySecondBinding

class secondActivity2 : AppCompatActivity() {
    private lateinit var  binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra(EXTRA_NAME)
        with(binding){
            txtName.text = "hello $name !"
        }
    }
}