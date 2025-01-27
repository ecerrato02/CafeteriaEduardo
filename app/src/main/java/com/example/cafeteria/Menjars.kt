package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.Data.ComidaAdapter
import com.example.cafeteria.Data.ComidaViewModel
import com.example.cafeteria.Data.MenjarViewModel
import com.example.cafeteria.databinding.FragmentMenjarsBinding

class Menjars : Fragment() {

    private val viewModel: MenjarViewModel by viewModels()
    private val menuViewModel: ComidaViewModel by activityViewModels<ComidaViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMenjarsBinding.inflate(inflater)

        val comida = viewModel.pillarComida()

        val adapter = ComidaAdapter(comida, menuViewModel)

        binding.recyclerviewMenjars.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerviewMenjars.adapter = adapter

        return binding.root
    }
}