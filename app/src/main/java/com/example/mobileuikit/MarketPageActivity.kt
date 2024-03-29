package com.example.mobileuikit

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MarketPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_market_page)

        findViewById<LinearLayout>(R.id.post_1).setOnClickListener {
            startActivity(
                Intent(this,CongratulationsPageActivity::class.java)
            )
        }
    }
}