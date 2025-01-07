package com.example.cafeteria.Data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cafeteria.R

class TotalAdapter(private val mList: List<ComidaModel>, private val menuViewModel: ComidaViewModel) : RecyclerView.Adapter<TotalAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.total_recycler, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val comida = mList[position]

        when(comida.type){
            1 -> holder.ImageViewComida.setImageResource(R.drawable.bocadillo)
            2 -> holder.ImageViewComida.setImageResource(R.drawable.bebida)
            3 -> holder.ImageViewComida.setImageResource(R.drawable.postre)
        }
        // sets the image to the imageview from our itemHolder class
        holder.textViewNom.text = comida.nombre

        // sets the text to the textview from our itemHolder class
        holder.textViewPrice.text = comida.precio.toString() + "€"

        holder.deleteProductButton.setOnClickListener {
            menuViewModel.eliminarProducto(position)
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ImageViewComida: ImageView = itemView.findViewById(R.id.imageviewMenjars)
        val textViewNom: TextView = itemView.findViewById(R.id.textViewNomMenjar)
        val textViewPrice: TextView = itemView.findViewById(R.id.textViewPreuMenjar)
        val deleteProductButton: ImageButton = itemView.findViewById(R.id.botonImagen)
    }
}