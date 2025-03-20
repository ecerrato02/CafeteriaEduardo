package com.example.cafeteria.Data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.math.RoundingMode
import java.text.DecimalFormat

class ComidaViewModel : ViewModel(){
    private val _menu : MutableLiveData<List<ComidaModel>> = MutableLiveData<List<ComidaModel>>()
    val menu: LiveData<List<ComidaModel>>
        get() = _menu

    fun anadirProducto(id: Int){
        val list = mutableListOf<ComidaModel>()
        _menu.value?.let {list.addAll(it)}
        ComidaProvider.loadComida().find { it.id == id}?.let { list.add(it) }
        _menu.value = list
    }

    fun contarProductos() : Int{
        return _menu.value!!.size
    }

    fun getTotal(): Double {
        val total = _menu.value?.map{ it.precio }?.sum()
        val decimales = DecimalFormat("#.##")
        decimales.roundingMode = RoundingMode.CEILING
        if(total == null){
            return 0.0
        }
        return decimales.format(total).toDouble()
    }

    fun limpiar(){
        val list = mutableListOf<ComidaModel>()
        _menu.value = list
    }

    fun eliminarProducto(position: Int) {
        val list = mutableListOf<ComidaModel>()
        _menu.value?.let { list.addAll(it) }
        list.removeAt(position)
        _menu.value = list
    }
}