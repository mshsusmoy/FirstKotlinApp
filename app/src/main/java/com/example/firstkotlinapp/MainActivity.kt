package com.example.firstkotlinapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFragmentOne = true
    var transaction = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragmentOne()


        hello_button.setOnClickListener {
            textview_say.setText("Hi Susmoy!")
            hello_button.setBackgroundColor(Color.WHITE)
            hello_button.setText("Hi")
            if(isFragmentOne) showFragmentTwo() else showFragmentOne()
        }

        val numberDataArray: ArrayList<String> = ArrayList()
        for (i in 1..5) {
            numberDataArray.add("" + i)
        }

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = DemoAdapter(numberDataArray)
    }

    fun showFragmentOne(){
        val fragment_transaction_one = transaction.beginTransaction()
        val fragmentOne = FragmentOne()
        fragment_transaction_one.replace(R.id.fragment_container,fragmentOne)
        fragment_transaction_one.addToBackStack(null)
        fragment_transaction_one.commit()
        isFragmentOne = true
    }

    fun showFragmentTwo(){
        val fragment_transaction_two = transaction.beginTransaction()
        val fragmentOne = FragmentTwo()
        fragment_transaction_two.replace(R.id.fragment_container,fragmentOne)
        fragment_transaction_two.addToBackStack(null)
        fragment_transaction_two.commit()
        isFragmentOne = false
    }
}
