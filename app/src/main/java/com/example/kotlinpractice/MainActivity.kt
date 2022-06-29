package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                //to do..
            }
        })

        //람다식을 사용하기 위한 두가지 조건.
        //1. kotlin interface가 아닌 Java Interface여야 한다.
        //2. 그 메소드는 단 하나의 메소드만을 가져야 한다.

        button.setOnClickListener {
            //to do..
        } // 위 메소드랑 같다. 람다식 제대로 이해하고 넘어가자 .

    }
}