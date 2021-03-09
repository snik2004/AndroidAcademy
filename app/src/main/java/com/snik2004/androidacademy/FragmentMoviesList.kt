package com.snik2004.androidacademy

import android.app.SearchManager
import android.net.sip.SipAudioCall
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {

    private var openFragment: View? = null
    private var listener: TransactionsFragmentClicks? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootview = inflater.inflate(R.layout.fragment_movies_list, container, false)
        return rootview
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val activity = requireActivity()
            listener = activity as TransactionsFragmentClicks

            openFragment = view.findViewById<View>(R.id.card)
                .apply {

                    setOnClickListener {
                        listener?.openDetailFragment()
                        Log.d("ololo", "ololo")
                    }
                }


    }


    fun setClickListener(l: TransactionsFragmentClicks?) {
        listener = l
    }


}