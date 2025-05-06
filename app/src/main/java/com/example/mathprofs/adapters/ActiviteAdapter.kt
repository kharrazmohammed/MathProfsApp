package com.example.mathprofs.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mathprofs.R
import com.example.mathprofs.activities.PreviewActivities
import com.example.mathprofs.activities.PreviewExercice
import com.example.mathprofs.activities.preview
import com.example.mathprofs.models.Exercice
import com.example.mathprofs.models.activite

class ActiviteAdapter(private val activitis : List<activite>): RecyclerView.Adapter<ActiviteAdapter.activiteViewHolder>() {
    inner class activiteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titreExercice: TextView = itemView.findViewById(R.id.tvTitre)
        val titreNiveau : TextView = itemView.findViewById(R.id.tvNiveau)
        val image_fiche : ImageView = itemView.findViewById(R.id.imageIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): activiteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fiche, parent, false)
        return activiteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return activitis.size
    }

    override fun onBindViewHolder(holder: activiteViewHolder, position: Int) {
        val exo = activitis[position]
        holder.titreExercice.text = exo.titre_activite
        holder.titreNiveau.text = "Activite Geogebra"
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent  = Intent(context, PreviewActivities::class.java)
            intent.putExtra("titre_de_activity",exo.titre_activite)
            intent.putExtra("html_path",exo.path_ggb)
            context.startActivity(intent)
        }


    }
}