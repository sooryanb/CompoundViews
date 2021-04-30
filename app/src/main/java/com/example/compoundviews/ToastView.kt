package com.example.compoundviews

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ToastView (context: Context?, toastableText: String ) : ConstraintLayout(context!!) {


    init {
        inflate(getContext(), R.layout.toast_view, this)

        val toastText = toastableText
        val toastTextView = findViewById<TextView>(R.id.textView)
        toastTextView.text = toastText

        val toastButton = findViewById<Button>(R.id.button)
        toastButton.setOnClickListener {
            Toast.makeText(getContext(), toastText, Toast.LENGTH_SHORT).show()
        }


    }


}