package com.example.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cafeteria.Data.ComidaAdapter
import com.example.cafeteria.Data.ComidaProvider
import com.example.cafeteria.databinding.FragmentMenjarsBinding


class Menjars : Fragment() {
    companion object {
        fun newInstance() = Menjars()
    }

//    private val viewModel: ComidaProvider by viewModels()
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMenjarsBinding.inflate(inflater)

        binding.recyclerviewMenjars.layoutManager = GridLayoutManager(context, 2)
//        binding.recyclerviewMenjars.adapter = ComidaAdapter(ComidaProvider.instance.loadComida().filter { it.type == 1})
        return binding.root
    }
}