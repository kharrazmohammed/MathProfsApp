package com.example.mathprofs.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mathprofs.R
import com.example.mathprofs.activities.preview
import com.example.mathprofs.models.Exercice
import com.example.mathprofs.models.Fiche

class FicheAdapter(private val fiches: List<Fiche>) : RecyclerView.Adapter<FicheAdapter.FicheViewHolder>() {

    inner class FicheViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titreFiche: TextView = itemView.findViewById(R.id.tvTitre)
        val titreNiveau : TextView = itemView.findViewById(R.id.tvNiveau)
        val image_fiche : ImageView = itemView.findViewById(R.id.imageIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FicheViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fiche, parent, false)
        return FicheViewHolder(view)
    }

    override fun onBindViewHolder(holder: FicheViewHolder, position: Int) {
        val fiche = fiches[position]
        holder.titreFiche.text = fiche.titre_fiche
        holder.titreNiveau.text = fiche.Niveau_Scolaire
        holder.itemView.setOnClickListener {
            val context =  holder.itemView.context
            val intent  = Intent(context,preview::class.java)
            intent.putExtra("titre_fiche",holder.titreFiche.text)
            intent.putExtra("niveau_scolaire",holder.titreNiveau.text)
            intent.putExtra("lien_pdf",fiche.pdf_uri)
            intent.putExtra("lien_word",fiche.word_uri)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return fiches.size
    }
}
