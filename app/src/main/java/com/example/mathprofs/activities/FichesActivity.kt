package com.example.mathprofs.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mathprofs.R
import com.example.mathprofs.adapters.FicheAdapter
import com.example.mathprofs.utils.help
import com.google.android.material.chip.Chip
import android.text.Editable
import android.text.TextWatcher


class FichesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercices)
        val btnback = findViewById<ImageButton>(R.id.btnBackexo)
        val array_fiches = help()
        val recyclerView = findViewById<RecyclerView>(R.id.rvFiches)
        val btnchip_1AC = findViewById<Chip>(R.id.chip1AC)
        val btnchip_2AC = findViewById<Chip>(R.id.chip2AC)
        val btnchip_3AC = findViewById<Chip>(R.id.chip3AC)
        val btnchip_all = findViewById<Chip>(R.id.chipall)
        val search_input = findViewById<EditText>(R.id.etSearch)
        window.setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = FicheAdapter(array_fiches.toutesLesFiches)
        recyclerView.adapter = adapter
        //button tous
        btnchip_all.setOnClickListener{
            val tous_les_fiches = array_fiches.toutesLesFiches
            val adapter_filter = FicheAdapter(tous_les_fiches)
            recyclerView.adapter = adapter_filter
        }

        // button filter 1AC
        btnchip_1AC.setOnClickListener {
            val fiches1AC = array_fiches.toutesLesFiches.filter { it.Niveau_Scolaire.equals("1AC") }
            val adapter_filtre = FicheAdapter(fiches1AC)
            recyclerView.adapter = adapter_filtre
        }

        btnchip_2AC.setOnClickListener {
            val fiches2AC = array_fiches.toutesLesFiches.filter { it.Niveau_Scolaire.equals("2AC") }
            val adapter_filtre = FicheAdapter(fiches2AC)
            recyclerView.adapter = adapter_filtre
        }

        btnchip_3AC.setOnClickListener {
            val fiches3AC = array_fiches.toutesLesFiches.filter { it.Niveau_Scolaire.equals("3AC") }
            val adapter_filtre = FicheAdapter(fiches3AC)
            recyclerView.adapter = adapter_filtre
        }

        // search
        search_input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Rien à faire ici
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().lowercase().trim()
                val filteredList = array_fiches.toutesLesFiches.filter {
                    it.titre_fiche.lowercase().contains(query)
                }
                recyclerView.adapter = FicheAdapter(filteredList)
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