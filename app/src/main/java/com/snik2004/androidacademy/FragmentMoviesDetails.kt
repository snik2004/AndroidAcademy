package com.snik2004.androidacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentMoviesDetails : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_movies_details, container, false)

        view.findViewById<TextView>(R.id.button_back)
            .setOnClickListener {
                activity?.let {
                    it.supportFragmentManager.popBackStack()
                }
            }

        return view
    }
}