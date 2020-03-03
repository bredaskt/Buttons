package com.bbreda.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setlisteners()
    }

    private fun setlisteners() {
        buttonDefault.setOnClickListener {
            Toast.makeText(this, "Clicou no botão default.", Toast.LENGTH_LONG).show()
        }

        buttonFlat.setOnClickListener {
            Toast.makeText(this, "Clicou no botão flat.", Toast.LENGTH_LONG).show()
        }

        buttonFloating.setOnClickListener {
            Toast.makeText(this, "Clicou no botão floating.", Toast.LENGTH_LONG).show()
        }
    }
}
