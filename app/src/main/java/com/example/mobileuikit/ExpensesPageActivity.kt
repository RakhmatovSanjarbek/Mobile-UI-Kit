package com.example.mobileuikit

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExpensesPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_expenses_page)

        findViewById<TextView>(R.id.expenses_page_item_1).setOnClickListener {
            startActivity(
                Intent(this,CalendarPageActivity::class.java)
            )
        }
    }
}