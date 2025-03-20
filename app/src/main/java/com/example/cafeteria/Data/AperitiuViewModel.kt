package com.example.cafeteria.Data

import androidx.lifecycle.ViewModel

class AperitiuViewModel :ViewModel() {
    fun pillarAperitiu(): List<ComidaModel>{
        return ComidaProvider.loadComida().filter { it.type == 4 }
    }
}