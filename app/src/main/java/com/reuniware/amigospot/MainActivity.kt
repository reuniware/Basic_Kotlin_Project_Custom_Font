package com.reuniware.amigospot

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var typeFace = ResourcesCompat.getFont(this@MainActivity, R.font.fallingsky)
        textViewHelloWorld.setTypeface(typeFace)*/
        textViewHelloWorld.textSize = 40f
    }
}
