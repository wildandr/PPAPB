package com.example.pertemuan5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.pertemuan5.MainActivity.Companion.EXTRA_NAME
import com.example.pertemuan5.databinding.ActivitySecondBinding
import com.example.pertemuan5.thirdActifity.Companion.EXTRA_ADDRESS

class secondActivity2 : AppCompatActivity() {
    private lateinit var  binding : ActivitySecondBinding

    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
            if (result.resultCode == Activity.RESULT_OK){
                val data = result.data

                val name = data?.getStringExtra(EXTRA_NAME)
                val address = data?.getStringExtra(EXTRA_ADDRESS)

                binding.txtName.text="Hello $name di $address"
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra(EXTRA_NAME)
        with(binding){
            txtName.text = "hello $name !"


            buttonToThird.setOnClickListener{
                val intent = Intent(this@secondActivity2,thirdActifity::class.java)
                    .apply { putExtra(EXTRA_NAME, name) }
                launcher.launch(intent)
            }
        }
    }
}