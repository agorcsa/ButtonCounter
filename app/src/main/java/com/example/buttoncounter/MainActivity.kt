package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    private var userInput : EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null
    private var numTimesClicked = 0

    companion object {
        const val NUM_TIMES_CLICKED = "numTimesClicked"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById(R.id.edit_text)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                numTimesClicked += 1
                textView?.append("Button was clicked $numTimesClicked time")
                if (numTimesClicked != 1) {
                    textView?.append("s\n")
                } else {
                    textView?.append("\n")
                }
            }
        })
    }
}
