package com.benjaminsinzore.countdowntimer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.iwgang.countdownview.CountdownView
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCvCountdownView = findViewById<CountdownView>(R.id.mycountdown)

        val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
        val countDate = "02-05-2022 00:00:00"
        val now = Date()


        try {
            //Formatting from String to Date
            val date = sdf.parse(countDate)
            val currentTime = now.time
            val newYearDate = date.time
            val countDownToNewYear = newYearDate - currentTime
            mCvCountdownView.start(countDownToNewYear)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
    }
}