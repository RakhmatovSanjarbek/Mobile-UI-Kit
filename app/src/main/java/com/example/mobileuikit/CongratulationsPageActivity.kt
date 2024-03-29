package com.example.mobileuikit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class CongratulationsPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_congratulations_page)

        findViewById<MaterialButton>(R.id.click_me).setOnClickListener{
            startActivity(
                Intent(this,SearchPageActivity::class.java)
            )
        }
    }
}