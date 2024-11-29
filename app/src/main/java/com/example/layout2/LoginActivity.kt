package com.example.layout2

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val username: EditText = findViewById(R.id.editTextText)
        val email: EditText = findViewById(R.id.editTextTextEmailAddress2)
        val password: EditText = findViewById(R.id.editTextTextPassword2)
        val loginButton: Button = findViewById(R.id.button2)

        loginButton.setOnClickListener{
            val nameText = username.text.toString().trim()
            val emailText = email.text.toString().trim()
            val passwordText = password.text.toString().trim()

            if (nameText.isBlank()){
                username.error  = "Username is required"
            }else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
                email.error = "Invalid email address"
            }else if (passwordText.isBlank()){
                password.error = "Password is required"
            }else{
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}