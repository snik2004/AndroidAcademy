package com.snik2004.androidacademy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: Array<String>) :
        RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val moviePoster: ImageView
        val duration: TextView
        val rating: TextView
        val genre: TextView
        val pg: RatingBar
        val reviews: TextView
        val movieName: TextView
        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.textView)
             moviePoster=itemView.findViewById(R.id.movie_poster)
             duration = itemView.findViewById(R.id.duration)
             rating = itemView.findViewById(R.id.rating_bar)
             genre = itemView.findViewById(R.id.genre)
             pg = itemView.findViewById(R.id.pg)
             reviews = itemView.findViewById(R.id.count_reviews)
             movieName = itemView.findViewById(R.id.name_film)

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.view_holder_movie, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = dataSet[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}