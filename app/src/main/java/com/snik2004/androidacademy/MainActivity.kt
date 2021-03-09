package com.snik2004.androidacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(), TransactionsFragmentClicks {

    private val rootFragment = FragmentMoviesList().apply { setClickListener(this@MainActivity) }
    private val secondFragment =
        FragmentMoviesDetails().apply { setClickListener(this@MainActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .apply { add(R.id.frame_container, rootFragment).commit() }
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    }

    override fun openDetailFragment() {

        supportFragmentManager.beginTransaction().addToBackStack("first")
            .apply {
                add(R.id.frame_container, secondFragment)
                    .commit()
            }
    }

    override fun backToPreviousFragment() {

        supportFragmentManager.beginTransaction().addToBackStack("two")
            .apply {
                replace(R.id.frame_container, rootFragment)
                    .commit()
            }
    }


}




