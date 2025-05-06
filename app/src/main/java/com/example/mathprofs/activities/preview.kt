package com.example.mathprofs.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.FileProvider
import com.example.mathprofs.R
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.FileOutputStream

class preview : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        val pdfView = findViewById<PDFView>(R.id.pdfViewDocumentFiche)
        val titreFiche = intent.getStringExtra("titre_fiche")
        val assetPath = intent.getStringExtra("lien_pdf") // Ex: "1AC/pdf/Les_Fractions.pdf"
        val toolbar = findViewById<Toolbar>(R.id.toolbarPreviewFiche)

        setSupportActionBar(toolbar)
        supportActionBar?.title = titreFiche

        if (!assetPath.isNullOrEmpty()) {
            try {
                val pdfFile = copyAssetToCache(assetPath)
                pdfView.fromFile(pdfFile)
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .load()
            } catch (e: Exception) {
                Toast.makeText(this, "Erreur lors du chargement du fichier PDF", Toast.LENGTH_SHORT).show()
                e.printStackTrace()
            }
        } else {
            Toast.makeText(this, "Fichier PDF introuvable", Toast.LENGTH_SHORT).show()
        }
    }

    private fun copyAssetToCache(assetPath: String): File {
        val inputStream = assets.open(assetPath)
        val outFile = File(cacheDir, File(assetPath).name)
        inputStream.use { input ->
            FileOutputStream(outFile).use { output ->
                input.copyTo(output)
            }
        }
        return outFile
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
    }
}
