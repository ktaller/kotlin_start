package com.example.tryagain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val textView4 = findViewById<TextView>(R.id.textView4)
        val nextButton = findViewById<Button>(R.id.button)

        val data = intent.getStringExtra("key")
        textView4.text = "$data"

        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", "Data passed to Second Activity") // Pass additional data if needed
            startActivity(intent)
        }
    }
}
