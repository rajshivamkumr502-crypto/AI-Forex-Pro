package com.aiforex.pro

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 50, 30, 30)
        layout.setBackgroundColor(Color.BLACK)

        val title = TextView(this)
        title.text = "AI FOREX PRO"
        title.textSize = 30f
        title.setTextColor(Color.GREEN)

        val subtitle = TextView(this)
        subtitle.text = "Smart Forex Trading Platform"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.WHITE)

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
