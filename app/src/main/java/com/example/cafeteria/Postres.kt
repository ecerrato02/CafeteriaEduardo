package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.Data.BebidaViewModel
import com.example.cafeteria.Data.ComidaAdapter
import com.example.cafeteria.Data.ComidaViewModel
import com.example.cafeteria.Data.PostreViewModel
import com.example.cafeteria.databinding.FragmentBegudesBinding

class Postres : Fragment() {

    private val viewModel: PostreViewModel by viewModels()
    private val menuViewModel: ComidaViewModel by activityViewModels<ComidaViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBegudesBinding.inflate(inflater)

        val comida = viewModel.pillarPostre()
        val adapter = ComidaAdapter(comida, menuViewModel)
        binding.recyclerviewBegudes.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerviewBegudes.adapter = adapter

        return binding.root
    }
}