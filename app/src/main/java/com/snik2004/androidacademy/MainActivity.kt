package com.snik2004.androidacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_activity_detail)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .add(R.id.frame_container, FragmentMoviesList())
//                .commit()
//        }

    }
}