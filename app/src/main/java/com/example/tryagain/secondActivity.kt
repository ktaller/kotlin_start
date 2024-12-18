package com.example.tryagain

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1)

        val data = intent.getStringExtra("key")
        val textView = findViewById<TextView>(R.id.button4)
        textView?.text = data
    }
}
