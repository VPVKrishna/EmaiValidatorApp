package com.krishna.emailvalidatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = "myName@example.com"
        val valid = true //EmailValidator.getInstance().isValid(email)

        Toast.makeText(this, "IsValid Email($email) : $valid", Toast.LENGTH_SHORT).show()
    }
}
