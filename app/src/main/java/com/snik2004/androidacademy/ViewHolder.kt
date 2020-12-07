package com.snik2004.androidacademy

import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val moviePoster: ImageView = itemView.findViewById(R.id.movie_poster)
    private val duration: TextView = itemView.findViewById(R.id.duration)
    private val rating: TextView = itemView.findViewById(R.id.rating_bar)
    private val genre: TextView = itemView.findViewById(R.id.genre)
    private val pg: RatingBar = itemView.findViewById(R.id.pg)
    private val reviews: TextView = itemView.findViewById(R.id.count_reviews)
    private val movieName: TextView = itemView.findViewById(R.id.name_film)

    fun bind(movie: Movie){
        loadImageAsync()
    }

}