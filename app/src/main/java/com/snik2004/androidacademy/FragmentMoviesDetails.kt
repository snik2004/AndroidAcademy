package com.snik2004.androidacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import java.lang.ClassCastException


class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {

    private var backFragment: View? = null
    private var listener: TransactionsFragmentClicks? =null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootview = inflater.inflate(R.layout.fragment_movies_details, container, false)
        return rootview
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {


            val activity = requireActivity()
            listener = activity as TransactionsFragmentClicks
            backFragment = view.findViewById<View>(R.id.tv_back)
                .apply {
                    setOnClickListener { listener?.backToPreviousFragment() }
                }
        }catch (e: ClassCastException){

        }
    }


    fun setClickListener(l: TransactionsFragmentClicks?) {
        listener = l
    }


}