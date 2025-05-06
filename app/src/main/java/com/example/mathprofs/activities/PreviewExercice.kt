package com.example.mathprofs.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.mathprofs.R
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.FileOutputStream

class PreviewExercice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_exercice)

        val pdfView = findViewById<PDFView>(R.id.pdfViewDocument)
        val titreExercice = intent.getStringExtra("titre_de_serie")
        val assetPath = intent.getStringExtra("pdf_path") // Ex: "1AC/pdf/Les_Fractions.pdf"
        val toolbar = findViewById<Toolbar>(R.id.toolbarPreview)

        setSupportActionBar(toolbar)
        supportActionBar?.title = titreExercice

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
