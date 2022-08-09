package com.qihaocai.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.hellobutton)

        button.setOnClickListener {
            Toast.makeText(this, "Hello There!", Toast.LENGTH_SHORT).show()
            Log.v("hello world", "button clicked")
        }

    }
}