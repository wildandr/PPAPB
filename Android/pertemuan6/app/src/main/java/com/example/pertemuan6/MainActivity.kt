package com.example.pertemuan6

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.pertemuan6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateStateListener,  {

    private lateinit var binding: ActivityMainBinding
    private val province = arrayOf(
        "Jawa Tengah",
        "Daerah Istimewa Yogyakarta",
        "Bali"
    )
    private lateinit var country : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        country = resources.getStringArray(com.example.pertemuan6.R.array.countries)
        with(binding) {
            val adapterProvince = ArrayAdapter(this@MainActivity,
                R.layout.simple_spinner_item, province)
            adapterProvince.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
            spinnerProvince.adapter = adapterProvince

            val adapterCountry = ArrayAdapter(this@MainActivity,
                R.layout.simple_spinner_item, country)
            adapterCountry.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
            spinnerCountry.adapter = adapterCountry


            spinnerCountry.onItemSelectedListener=
                object : AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                        val country = country[position]
                        Toast.makeText(this@MainActivity,country,Toast.LENGTH_SHORT)
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                    }

                }


            datePicker.init(
                datePicker.year,
                datePicker.month,
                datePicker.dayOfMonth
            ) {
                _, year, monthOfYear, dayOfMonth ->
                val selectedDate = "$dayOfMonth/${monthOfYear+1}/$year"
                Toast.makeText(this@MainActivity,selectedDate,Toast.LENGTH_SHORT).show()
                Log.d("SELECTED DATE", "$dayOfMonth/${monthOfYear +1}/$year")
            }

            timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
                var selectedTime = String.format("%02d:%02d",hourOfDay,minute)

                Toast.makeText(this@MainActivity,selectedTime,
                    Toast.LENGTH_SHORT).show()
                Log.d("SELECTED TIME", selectedTime)


            }

            btnShowCalendar.setOnClickListener {
                val datePicker = datePicker()
                datePicker.show(supportFragmentManager, "datePicker")
            }

        }
    }
    override fun onDateSet()
}