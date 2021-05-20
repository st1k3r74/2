package com.example.prkt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Main1Activity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }

    fun random(view: View) {
        val btn = findViewById<Button>(R.id.button2)
        val textView2 = findViewById<TextView>(R.id.textView5)
        btn.setOnClickListener {
            val random = Random.nextInt(10, 99) + 1
            textView2.text = random.toString()
            count++
            var textView = findViewById(R.id.textView4) as TextView
            textView.text = "$count"
        }
    }
}