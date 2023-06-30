package com.example.chatdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class chatdev3 : AppCompatActivity() {

    private lateinit var messageTextView: TextView
    private lateinit var messageEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        messageTextView = TextView(this)
        layout.addView(messageTextView)

        messageEditText = EditText(this)
        layout.addView(messageEditText)

        sendButton = Button(this)
        sendButton.text = "Send"
        sendButton.setOnClickListener {
            val message = messageEditText.text.toString()
            displayMessage(message)
            messageEditText.text.clear()
        }
        layout.addView(sendButton)

        setContentView(layout)
    }

    private fun displayMessage(message: String) {
        val currentMessages = messageTextView.text.toString()
        val newMessage = "$currentMessages\n$message"
        messageTextView.text = newMessage
    }
}
//                val btnback2: Button = findViewById(R.id.btnback2)
//
//                btnback2.setOnClickListener {
//                    val intent = Intent(this, chatdev2::class.java)
//                    startActivity(intent)
//                }



