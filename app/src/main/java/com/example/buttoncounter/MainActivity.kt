package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"
private const val TEXT_CONTENT = "text content"

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
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
                Log.d(TAG, "onClick: called")
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text.clear()
                //userInput.setText("")
            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "onStart: called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
        val savedString = savedInstanceState.getString(TEXT_CONTENT)
        textView?.text = savedString
    }

    override fun onResume() {
        Log.d(TAG, "onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: called")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENT, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop: called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: called")
        super.onDestroy()
    }
}
