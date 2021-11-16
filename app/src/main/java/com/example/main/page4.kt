package com.example.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class activity_page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        val mButton = findViewById<View>(R.id.button2) as Button
        mButton.setOnClickListener {
            startActivity(
                Intent(
                    this@activity_page4,
                    activity_page1::class.java
                )
            )
        }
    }
}