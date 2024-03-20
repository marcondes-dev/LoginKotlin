package com.example.login
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent



class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                if (username == "user" && password == "1234") {
                    val intent = Intent(this, ChangeCredentialsActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    showErrorDialog()
                }
            }
        }
    }

    private fun showErrorDialog() {
        Toast.makeText(this, "Username or password is incorrect", Toast.LENGTH_SHORT).show()
    }
}