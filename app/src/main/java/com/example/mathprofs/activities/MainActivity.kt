package com.example.mathprofs.activities



import android.content.Intent
import com.example.mathprofs.R
import android.os.Bundle
import android.widget.Button
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
            val intent=Intent(this,About::class.java)
            startActivity(intent)
            finish()
        }
        btnGeogebra.setOnClickListener {
            val intent=Intent(this,ActivitiesActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnFiches.setOnClickListener {
            val intent=Intent(this,FichesActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSeries.setOnClickListener {
            val intent=Intent(this,ExercicesActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}