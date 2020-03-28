package jp.techacademy.yuu.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // インスタンス作成
        val human1 = Human("ゆう",36,"掃除")
        human1.say()
        human1.think()

        // インスタンス作成
        val human2 = Human("ゆきこ",32,"洗濯")
        human2.say()
        human2.think()
    }
}