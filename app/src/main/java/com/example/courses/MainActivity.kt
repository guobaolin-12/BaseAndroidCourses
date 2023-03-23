package com.example.courses

import android.content.Intent
import android.net.Uri
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
                //发送数据到页面2：SecondActivity
//                var name = edtName.text.trim().toString()
//                var password = edtPsw.text.trim().toString()
//                println("name:$name")
//                println("password:$password")
//                var intent = Intent(this@MainActivity, SecondActivity::class.java)
//                intent.putExtra("name", name)
//                intent.putExtra("password", password)
////                startActivity(intent)
//                startActivityForResult(intent, 500)

                //测试隐式的Intent
                //manifest必须定义action，默认的defalut category
//                var intent = Intent("com.example.test")
//                intent.addCategory("com.example.test")
//                intent.type = "text/plain"
//                startActivity(intent)

                //调用系统组件,比如打电话，发短信
                var intent=Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:800400"))
                startActivity(intent)

            }
        })

//        button.setOnClickListener { println("helloworld") }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 500) {
            if (resultCode == 200) {
                var result = data?.getStringExtra("result")
                println("result:$result")
            } else if (resultCode == 100) {
                var result = data?.getStringExtra("result")
                println("result:$result")
            }
        }
    }
}