package com.jos.dem.launcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.applitools.appium.helper.androidx.EyesAppiumHelper
import com.applitools.vhs.EyesUfg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EyesAppiumHelper.initialize(this.getApplication());
        EyesUfg.setupAppium(this.getApplication())
        val button = findViewById<Button>(R.id.button)
        val message = findViewById<TextView>(R.id.message)
        val messageChanged = getString(R.string.text_view_message_changed)
        button.setOnClickListener { message.text = messageChanged }

    }
}