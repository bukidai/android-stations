package com.example.techtrain.railway.android

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.btShow)
        button.setOnClickListener(ButtonClickListener())
    }

    inner class ButtonClickListener : View.OnClickListener {
        override fun onClick(v: View) {
            val editText = findViewById<EditText>(R.id.editTextText)
            val textView = findViewById<TextView>(R.id.text)
            textView.text = editText.text.toString()
        }
    }
}
