package com.example.cafeteria.Data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cafeteria.R

class ComidaAdapter (private val mList: List<ComidaModel>, private val menuViewModel: ComidaViewModel) : RecyclerView.Adapter<ComidaAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menjars_recycler, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val comida = mList[position]

        when(comida.type){
            1 -> holder.comidaImage.setImageResource(R.drawable.bocadillo)
            2 -> holder.comidaImage.setImageResource(R.drawable.bebida)
            3 -> holder.comidaImage.setImageResource(R.drawable.postre)
            4 -> holder.comidaImage.setImageResource(R.drawable.bebida)
        }
        holder.comidaNombre.text = comida.nombre
        holder.comidaPrecio.text = comida.precio.toString() + "€"

        holder.layoutComida.setOnClickListener{
             menuViewModel.anadirProducto(comida.id)
            menuViewModel.contarProductos()
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val comidaImage: ImageView = itemView.findViewById(R.id.imageviewMenjars)
        val comidaNombre: TextView = itemView.findViewById(R.id.textViewNomMenjar)
        val comidaPrecio: TextView = itemView.findViewById(R.id.textViewPreuMenjar)
        val layoutComida : LinearLayout = itemView.findViewById(R.id.layoutComida)
    }
}