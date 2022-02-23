package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val intent = getIntent()
        //1
        //val hoten : String? = intent.getStringExtra("name")
        //2
        //val num : Int = intent.getIntExtra("data", 0)
        //3
        //val array : IntArray? = intent.getIntArrayExtra("data")
        //4
        val stu : HocSinh = intent.getSerializableExtra("data") as HocSinh

        val tv_noidung : TextView = findViewById(R.id.tv_content)
        tv_noidung.text = stu.ten + " - " + stu.namsinh + " - " + stu.diachi

    }
}