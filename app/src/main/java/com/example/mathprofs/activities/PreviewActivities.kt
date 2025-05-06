package com.example.mathprofs.activities

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.mathprofs.R

class PreviewActivities : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_activities)

        // Récupération des vues
        val webView = findViewById<WebView>(R.id.webViewGeoGebra)
        val toolbar = findViewById<Toolbar>(R.id.toolbarPreviewgeogebra)

        // Données reçues via Intent
        val titre = intent.getStringExtra("titre_de_activity") ?: "Aperçu activité"
        val htmlAssetPath = intent.getStringExtra("html_path")

        // Configuration de la Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = titre
            setDisplayHomeAsUpEnabled(true)
        }

        // Configuration WebView
        webView.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            settings.allowFileAccess = true
            settings.allowContentAccess = true
        }

        // Construction du chemin complet et chargement
        if (!htmlAssetPath.isNullOrBlank()) {
            val fullPath = "file:///android_asset/$htmlAssetPath"
            Log.d("HTML_PATH", "Loading HTML from: $fullPath")
            webView.loadUrl(fullPath)
        } else {
            Log.e("HTML_PATH", "html_path is null or blank!")
        }
    }

    // Gérer le bouton retour
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
