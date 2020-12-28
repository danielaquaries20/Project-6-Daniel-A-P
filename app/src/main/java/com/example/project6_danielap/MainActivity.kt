package com.example.project6_danielap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Alert Dialog
        buttonLogin.onClick {
            alert("Apakah Anda Yakin Ingin Login ?") {
                noButton {
                    //Action
                    longToast("Anda Tidak Jadi Login")
                }
                yesButton {
                    //Action
                    startActivity<ActivityMasuk>()
                    longToast("Anda Berhasil Login")
                }
            }.show()
        }
    }
}