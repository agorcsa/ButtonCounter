package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById(R.id.edit_text)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        userInput.setText("")

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text.clear()
                //userInput.setText("")
            }
        })
    }
}
