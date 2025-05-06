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
import com.example.mathprofs.adapters.ExerciceAdapter
import com.example.mathprofs.adapters.FicheAdapter
import com.example.mathprofs.utils.help
import com.google.android.material.chip.Chip

class ExercicesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiches)

        //buttons

        val btn_retour =  findViewById<ImageButton>(R.id.btnRetourSeriesExo)
        val help_exercices = help()
        val recyclerview_exercices = findViewById<RecyclerView>(R.id.rvSeriesExercices)
        val btn_chip_1AC_exo = findViewById<Chip>(R.id.chipNiveau1AC)
        val btn_chip_2AC_exo = findViewById<Chip>(R.id.chipNiveau2AC)
        val btn_chip_3AC_exo = findViewById<Chip>(R.id.chipNiveau3AC)
        val btn_chip_all_exos =  findViewById<Chip>(R.id.chipNiveauTous)
        val adapter_pour_exercices = ExerciceAdapter(help_exercices.TousLesExos)
        val search_exos_input = findViewById<EditText>(R.id.etRechercheSeriesExo)


        window.setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)

        // les evenemnts

        btn_retour.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        recyclerview_exercices.layoutManager = LinearLayoutManager(this)
        recyclerview_exercices.adapter = adapter_pour_exercices

        btn_chip_all_exos.setOnClickListener {
            val exos = help_exercices.TousLesExos
            val adapter_filter = ExerciceAdapter(exos)
            recyclerview_exercices.adapter = adapter_filter
        }

        btn_chip_1AC_exo.setOnClickListener {
            val exos_1AC = help_exercices.TousLesExos.filter { it -> it.Niveau.equals("1AC") }
            val adapter_filter = ExerciceAdapter(exos_1AC)
            recyclerview_exercices.adapter = adapter_filter
        }
        btn_chip_2AC_exo.setOnClickListener {
            val exos_2AC = help_exercices.TousLesExos.filter { it->it.Niveau.equals("2AC") }
            val adapter_filter = ExerciceAdapter(exos_2AC)
            recyclerview_exercices.adapter = adapter_filter
        }
        btn_chip_3AC_exo.setOnClickListener {
            val exos_3AC = help_exercices.TousLesExos.filter { it->it.Niveau.equals("3AC") }
            val adapter_filter = ExerciceAdapter(exos_3AC)
            recyclerview_exercices.adapter = adapter_filter
        }

        search_exos_input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Rien à faire ici
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().lowercase().trim()
                val filteredList = help_exercices.TousLesExos.filter {
                    it.titre_series.lowercase().contains(query)
                }
                recyclerview_exercices.adapter = ExerciceAdapter(filteredList)
            }

            override fun afterTextChanged(s: Editable?) {
                // Rien à faire ici
            }
        })



    }
}