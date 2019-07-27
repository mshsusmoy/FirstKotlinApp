package com.example.firstkotlinapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_button.setOnClickListener {
            textview_say.setText("Hi Susmoy!")
            hello_button.setBackgroundColor(Color.WHITE)
            hello_button.setText("Hi")
        }

        val numberDataArray: ArrayList<String> = ArrayList()
        for (i in 1..5) {
            numberDataArray.add("" + i)
        }

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = DemoAdapter(numberDataArray)
    }
}
