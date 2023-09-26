package com.example.pertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "MainactifityLifeCycle"

    private lateinit var binding:ActivityMainBinding
    companion object {
        var EXTRA_NAME = "text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate dipanggil")

        with(binding){
            buttonToSecond.setOnClickListener{
                val intenToSecondActifity =
                    Intent(this@MainActivity, secondActivity2::class.java)

                val name = editTxtName.text.toString()
                intenToSecondActifity.putExtra(EXTRA_NAME,name)


                startActivity(intenToSecondActifity)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop dipanggil")
    }
}