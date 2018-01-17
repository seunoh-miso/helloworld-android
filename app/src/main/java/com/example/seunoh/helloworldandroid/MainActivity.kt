package com.example.seunoh.helloworldandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val textView by lazy {
        findViewById<TextView>(R.id.view_text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Hello World! Kotlin in native!"
    }

    override fun onResume() {
        super.onResume()
        textView.text = "NDK: ${NativeUtil.stringFromJNI()}"
    }
}
