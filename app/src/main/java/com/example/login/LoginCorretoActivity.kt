package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginCorretoActivity : AppCompatActivity() {
    private lateinit var textMensagem: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_correto)

        textMensagem = findViewById(R.id.textMensagem)
        val login = intent.getStringExtra("login")

        textMensagem.text = "Bem-vindo(a), ${login}!"
    }
}
