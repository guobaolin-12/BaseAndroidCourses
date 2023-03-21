package com.example.courses

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edtName: EditText
    private lateinit var edtPsw: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.edt_name)
        edtPsw = findViewById(R.id.edt_psw)
        button = findViewById(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(button: View?) {
                var name=edtName.text.trim()
                var password=edtPsw.text.trim()
                println("name:$name")
                println("password:$password")
            }
        })
//        button.setOnClickListener { println("helloworld") }


    }
}