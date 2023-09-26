package com.example.pertemuan5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan5.MainActivity.Companion.EXTRA_NAME
import com.example.pertemuan5.databinding.ActivityThirdActifityBinding

class thirdActifity : AppCompatActivity() {
    private lateinit var binding  :ActivityThirdActifityBinding
    companion object{
        const val EXTRA_ADDRESS = "extra_address"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdActifityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(EXTRA_NAME)

        with(binding){
            buttonDissmiss.setOnClickListener(){
                val intent = Intent();
                intent.putExtra(EXTRA_ADDRESS, address)

                setResult(Activity.RESULT_OK, intent)
                finish()
            }
    }
}