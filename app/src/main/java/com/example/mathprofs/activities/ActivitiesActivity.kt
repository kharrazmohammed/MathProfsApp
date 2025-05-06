package com.example.mathprofs.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mathprofs.R
import com.example.mathprofs.adapters.ActiviteAdapter
import com.example.mathprofs.adapters.FicheAdapter
import com.example.mathprofs.utils.help
import com.google.android.material.chip.Chip

class ActivitiesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities)
        val btnback = findViewById<ImageButton>(R.id.btnBackActivite)
        val array_fiches = help()
        val recyclerView = findViewById<RecyclerView>(R.id.rvgeogebra)
        val search_input = findViewById<EditText>(R.id.etSearchgeogebra)
        window.setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ActiviteAdapter(array_fiches.tous_les_activites)
        recyclerView.adapter = adapter


        // search
        search_input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Rien à faire ici
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().lowercase().trim()
                val filteredList = array_fiches.tous_les_activites.filter {
                    it.titre_activite.lowercase().contains(query)
                }
                recyclerView.adapter = ActiviteAdapter(filteredList)
            }

            override fun afterTextChanged(s: Editable?) {
                // Rien à faire ici
            }
        })



        btnback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}