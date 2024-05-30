package com.dev.olutoba.bridgefy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 27 May, 2024
 * EMAIL: damexxey94@gmail.com
 */
class LauncherThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher_theme)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}