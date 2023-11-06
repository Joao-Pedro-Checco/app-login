package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editLogin: EditText
    private lateinit var editSenha: EditText
    private lateinit var buttonEntrar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editLogin = findViewById(R.id.editLogin)
        editSenha = findViewById(R.id.editSenha)
        buttonEntrar = findViewById(R.id.buttonEntrar)

        buttonEntrar.setOnClickListener {fazerLogin()}
    }

    private fun fazerLogin() {
        val login = editLogin.text.toString()
        val senha = editSenha.text.toString()

        val intent: Intent = if (loginValido(senha)) {
            Intent(this, LoginCorretoActivity::class.java)
        } else {
            Intent(this, LoginIncorretoActivity::class.java)
        }

        intent.putExtra("login", login)
        startActivity(intent)
    }

    private fun loginValido(senha: String): Boolean {
        return senha == "1234"
    }
}
