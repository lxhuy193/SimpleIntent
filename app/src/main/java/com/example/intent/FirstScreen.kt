package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        var testButton : Button = findViewById(R.id.btn_click)

        testButton.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            //1 String
            //intent.putExtra("name", "Le Xuan Huy")
            //2 Num -> required default number if input data_name or type is wrong
            //intent.putExtra("data", 193)
            //3 IntArray
            //var arrnum : IntArray = intArrayOf(12,34,56,78)
            //intent.putExtra("data", arrnum)
            //4 Object
            val hocsinh = HocSinh("Le Xuan Huy", 18, "Ha Noi")
            intent.putExtra("data", hocsinh)

            startActivity(intent)
        }
    }
}