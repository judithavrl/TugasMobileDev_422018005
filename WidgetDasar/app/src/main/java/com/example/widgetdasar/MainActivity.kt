package com.example.widgetdasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowId
import android.widget.*
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtnAdd = findViewById<ImageButton>(R.id.imgButtonAdd)
        val etNama = findViewById<EditText>(R.id.etNama)
        imgBtnAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Nama: ${etNama.text} telah berhasil disimpan", Toast.LENGTH_SHORT).show()
        }

        val imgBtnCancel = findViewById<ImageButton>(R.id.imgButtonCancel)
        imgBtnCancel.setOnClickListener{
            etNama.text.clear()
        }
    }

    fun onRbClicked(view: View) {
        val rb_pria = findViewById<RadioButton>(R.id.rb_pria)
        val rb_wanita = findViewById<RadioButton>(R.id.rb_wanita)
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.rb_pria ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                                "Gender: ${rb_pria.text}", LENGTH_SHORT).show()
                    }
                R.id.rb_wanita ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                                "Gender: ${rb_wanita.text}", LENGTH_SHORT).show()
                    }
            }
        }
    }

    fun printHobi(view: View) {
        val cbCoding = view.findViewById<CheckBox>(R.id.cbCoding)
        val cbReading = view.findViewById<CheckBox>(R.id.cbReading)
        val cbTraveling = view.findViewById<CheckBox>(R.id.cbTraveling)

        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cbCoding ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "Anda memilih hobi ${cbCoding.text}", LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(
                                applicationContext,
                                "Anda membatalkan pilihan hobi ${cbCoding.text}",
                                LENGTH_SHORT
                            ).show()
                    }
                R.id.cbReading ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "Anda memilih hobi ${cbReading.text}", LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "Anda membatalkan pilihan hobi ${cbReading.text}",
                            LENGTH_SHORT
                        ).show()
                    }
                R.id.cbTraveling ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "Anda memilih hobi ${cbTraveling.text}", LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(
                                applicationContext,
                                "Anda membatalkan pilihan hobi ${cbTraveling.text}",
                                LENGTH_SHORT
                            ).show()
                    }
            }
        }
    }
}


