package com.example.cafeteria.Data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cafeteria.R

class ComidaAdapter (private val mList: List<Comida>) : RecyclerView.Adapter<ComidaAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menjars_recycler, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val comida = mList[position]

        holder.comidaImage.setImageResource(R.drawable.bocadillo)
        holder.comidaNombre.text = comida.nombre
        holder.comidaPrecio.text = comida.precio.toString()

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val comidaImage: ImageView = itemView.findViewById(R.id.imageviewMenjars)
        val comidaNombre: TextView = itemView.findViewById(R.id.textViewNomMenjar)
        val comidaPrecio: TextView = itemView.findViewById(R.id.textViewPreuMenjar)
    }
}