package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cafeteria.Data.ComidaAdapter
import com.example.cafeteria.Data.ComidaModel
import com.example.cafeteria.Data.ComidaViewModel
import com.example.cafeteria.Data.MenjarViewModel
import com.example.cafeteria.Data.TotalAdapter
import com.example.cafeteria.databinding.FragmentPagamentBinding

class Pagament : Fragment() {

    private val viewModel: MenjarViewModel by viewModels()
    private val menuViewModel: ComidaViewModel by activityViewModels<ComidaViewModel>()
    private lateinit var adapter : TotalAdapter
    private lateinit var binding : FragmentPagamentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagamentBinding.inflate(inflater)


        menuViewModel.menu.observe(viewLifecycleOwner){
            updateRecycler()
        }
        binding.botonPagar.setOnClickListener() {
            pagar()
            Toast.makeText(context, "Pedido realizado", Toast.LENGTH_SHORT).show()
        }
        updateRecycler()
        return binding.root
    }
    private fun updateRecycler(){
        val menjar = menuViewModel.menu.value
        if(menjar != null){
            adapter = TotalAdapter(menjar, menuViewModel)
        } else{
            adapter = TotalAdapter(mutableListOf<ComidaModel>(), menuViewModel)
        }
        binding.recyclerviewMenjars.layoutManager = LinearLayoutManager(context)
        binding.recyclerviewMenjars.adapter = adapter
    }

    private fun pagar(){
        menuViewModel.limpiar()
        Toast.makeText(context, "Pedido pagado!", Toast.LENGTH_SHORT).show()
    }

    companion object{
    }
}