package com.example.courses

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var name = intent.getStringExtra("name")
        var password = intent.getStringExtra("password")
        println("name:$name password:$password")

        if (name.equals("zhangsan") && password.equals("123")) {
            var intent = Intent()
            intent.putExtra("result", "正常登陆")
            setResult(200, intent)
        } else {
            var intent = Intent()
            intent.putExtra("result", "无法登陆")
            setResult(100, intent)
        }
        finish()
    }
}