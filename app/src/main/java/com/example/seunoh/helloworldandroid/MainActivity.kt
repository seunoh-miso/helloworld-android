package com.example.seunoh.helloworldandroid

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private val textView by lazy {
        findViewById<TextView>(R.id.view_text)
    }

    private val view by lazy {
        findViewById<View>(R.id.container)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Hello World! Kotlin in native!"
        val random = Random()
        val bgColor = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
        view.setBackgroundColor(bgColor)
        textView.setTextColor(Color.rgb(255 - Color.red(bgColor),
                255 - Color.green(bgColor),
                255 - Color.blue(bgColor)))
    }

    override fun onResume() {
        super.onResume()
        textView.text = "NDK: ${NativeUtil.stringFromJNI()}"
    }
}
