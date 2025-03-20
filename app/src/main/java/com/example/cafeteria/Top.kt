package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.cafeteria.Data.ComidaViewModel
import com.example.cafeteria.databinding.FragmentTopBinding

class Top : Fragment() {
    private lateinit var binding : FragmentTopBinding
    private val menuViewModel: ComidaViewModel by activityViewModels<ComidaViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater)
        menuViewModel.menu.observe(viewLifecycleOwner) {
            binding.total.text = "Total: " + menuViewModel.getTotal().toString() + "€"
            binding.contador.text = "Pedidos: " + menuViewModel.contarProductos()
        }
        return binding.root
    }

    companion object {

    }
}