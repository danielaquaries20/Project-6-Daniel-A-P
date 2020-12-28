package com.example.project6_danielap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_masuk.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class ActivityMasuk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        buttonBack.onClick { onBackPressed() }
    }
}