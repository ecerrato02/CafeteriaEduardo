package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.Data.AperitiuViewModel
import com.example.cafeteria.Data.ComidaAdapter
import com.example.cafeteria.Data.ComidaViewModel
import com.example.cafeteria.databinding.FragmentAperitiusBinding

class Aperitius : Fragment() {

    private val viewModel: AperitiuViewModel by viewModels()
    private val menuViewModel: ComidaViewModel by activityViewModels<ComidaViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentAperitiusBinding.inflate(inflater)

        val comida = viewModel.pillarAperitiu()
        val adapter = ComidaAdapter(comida, menuViewModel)
        binding.recyclerviewAperitius.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerviewAperitius.adapter = adapter

        return binding.root
    }

    companion object {

    }
}