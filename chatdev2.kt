package com.example.chatdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class chatdev2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatdev2)

        val btnchat:Button=findViewById(R.id.btnchat)
        val btnBack:Button=findViewById(R.id.btnBack)
        val tvname:TextView=findViewById(R.id.tvname)

        val myName=intent.getStringExtra("MY_NAME")
         tvname.text=myName+"さん"

        btnchat.setOnClickListener {
            val intent=Intent(this,chatdev3::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
    }
}
