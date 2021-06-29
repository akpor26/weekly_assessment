package com.onovughe.week4assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    private lateinit var signBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signBtn = findViewById(R.id.signBtn)

        signBtn.setOnClickListener {
            var intent = Intent(this, Services::class.java)
            startActivity(intent)
        }
    }
}