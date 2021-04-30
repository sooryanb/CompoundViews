package com.example.compoundviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var linearLayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linearLay)
        linearLayout.addView(ToastView(this, "something"))
        linearLayout.addView(ToastView(this, "something2"))
        linearLayout.addView(ToastView(this, "something3"))

    }
}