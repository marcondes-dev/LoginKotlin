package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChangeCredentialsActivity : AppCompatActivity() {

    private lateinit var newUsernameEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_credentials)

        newUsernameEditText = findViewById(R.id.newUsernameEditText)
        newPasswordEditText = findViewById(R.id.newPasswordEditText)
        saveButton = findViewById(R.id.saveButton)

        saveButton.setOnClickListener {
            val newUsername = newUsernameEditText.text.toString()
            val newPassword = newPasswordEditText.text.toString()

            if (newUsername.isNotEmpty() && newPassword.isNotEmpty()) {
                saveNewCredentials(newUsername, newPassword)
            } else {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveNewCredentials(username: String, password: String) {
        Toast.makeText(this, "New credentials saved successfully", Toast.LENGTH_SHORT).show()
    }
}