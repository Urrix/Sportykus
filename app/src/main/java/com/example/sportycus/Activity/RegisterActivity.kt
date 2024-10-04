package com.example.sportycus.Activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sportycus.R

class RegisterActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var btnRegister: Button
    private lateinit var loginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Enlazar las vistas con findViewById
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        btnRegister = findViewById(R.id.btnRegister)
        loginTextView = findViewById(R.id.loginTextView)

        // Botón de registro
        btnRegister.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                registerUser(email, password)
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Texto "Ya tienes una cuenta" para volver al LoginActivity
        loginTextView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()  // Cerrar la pantalla de registro
        }
    }

    // Función para registrar al usuario (simulación)
    fun registerUser(email: String, password: String) {
        // Lógica de registro
        if (email.isNotEmpty() && password.isNotEmpty()) {
            // Aquí podrías implementar la lógica para registrar al usuario,
            // por ejemplo, enviando los datos a un servidor o guardándolos localmente.
            Log.d("Register", "Email: $email, Password: $password")
        } else {
            Log.d("Register", "Email o Password no proporcionados")
        }
    }
}
