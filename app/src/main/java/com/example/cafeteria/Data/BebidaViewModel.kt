package com.example.cafeteria.Data

import androidx.lifecycle.ViewModel

class BebidaViewModel : ViewModel() {
    fun pillarBebida(): List<ComidaModel>{
        return ComidaProvider.loadComida().filter { it.type == 2 }
    }
}