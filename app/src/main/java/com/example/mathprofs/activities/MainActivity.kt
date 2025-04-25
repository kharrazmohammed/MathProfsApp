package com.example.mathprofs.activities

import android.content.Intent
import com.example.mathprofs.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAPropos = findViewById<Button>(R.id.btnAPropos)
        val btnGeogebra = findViewById<Button>(R.id.btnGeogebra)
        val btnSeries = findViewById<Button>(R.id.btnSeries)
        val btnFiches = findViewById<Button>(R.id.btnFiches)


        btnAPropos.setOnClickListener {
            val intent=Intent(this,about::class.java)
            startActivity(intent)
            finish()
        }


    }
}