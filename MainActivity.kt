package com.example.chatdev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnlogin:Button=findViewById(R.id.btnlogin)
        val etname:EditText=findViewById(R.id.etname)



        btnlogin.setOnClickListener {

            if(etname.text.toString()==("")){
                Toast.makeText(this,"入力して",Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, chatdev2::class.java)


                intent.putExtra("MY_NAME", etname.text.toString())

                startActivity(intent)
            }
        }

    }
}