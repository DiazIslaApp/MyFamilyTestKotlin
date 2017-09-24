package com.example.christian.myfamilytestkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.content.Intent

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        showNewText()
    }

    companion object {
        const val new_message = "new_message"
    }

    fun showNewText () {

        // Get message
        val message = intent.getStringExtra("new_message")

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text = message
    }
}