package com.example.pertemuan8

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val fragment1 = Fragment1()
    private val fragment2 = Fragment2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the default fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment1)
            commit()
        }

        val btnChangeFragment: Button = findViewById(R.id.btnChangeFragment)

        // Set click listener for the button
        btnChangeFragment.setOnClickListener {
            // Replace the fragment
            if (fragment1.isVisible) {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, fragment2)
                    addToBackStack(null)
                    commit()
                }
            } else {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, fragment1)
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}