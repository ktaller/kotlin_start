package com.example.tryagain

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditTextView: EditText = findViewById(R.id.et_user_name)
        val emailEditTextView: EditText = findViewById(R.id.editTextTextEmailAddress)
        val passwordEditTextView: EditText = findViewById(R.id.et_password)
        val buttonView: Button = findViewById(R.id.btn_submit)

        buttonView.setOnClickListener {
            val nameText = nameEditTextView.text.toString().trim()
            val emailText = emailEditTextView.text.toString().trim()
            val passwordText = passwordEditTextView.text.toString().trim()

            if (nameText.isBlank()){
                nameEditTextView.error ="Name is required"
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
                emailEditTextView.error ="Invalid email address"
            }
            else if ( passwordText.isEmpty()){
                passwordEditTextView.error="password is required"
            }
            else{
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("key","welcome $nameText")
                startActivity( intent)
            }
            }
    }

}