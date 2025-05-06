package com.example.mathprofs.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mathprofs.R
import com.example.mathprofs.activities.PreviewExercice
import com.example.mathprofs.activities.preview
import com.example.mathprofs.models.Exercice

class ExerciceAdapter(private val exercices : List<Exercice>): RecyclerView.Adapter<ExerciceAdapter.ExerciceViewHolder>() {
    inner class ExerciceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titreExercice: TextView = itemView.findViewById(R.id.tvTitre)
        val titreNiveau : TextView = itemView.findViewById(R.id.tvNiveau)
        val image_fiche : ImageView = itemView.findViewById(R.id.imageIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fiche, parent, false)
        return ExerciceViewHolder(view)
    }

    override fun getItemCount(): Int {
        return exercices.size
    }

    override fun onBindViewHolder(holder: ExerciceViewHolder, position: Int) {
        val exo = exercices[position]
        holder.titreExercice.text = exo.titre_series
        holder.titreNiveau.text = exo.Niveau
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent  = Intent(context, PreviewExercice::class.java)
            intent.putExtra("titre_de_serie",exo.titre_series)
            intent.putExtra("Niveau_serie",exo.Niveau)
            intent.putExtra("pdf_path",exo.pdf_url)
            context.startActivity(intent)
        }


    }
}