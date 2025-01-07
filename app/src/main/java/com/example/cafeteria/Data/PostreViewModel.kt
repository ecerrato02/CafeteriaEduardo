package com.example.cafeteria.Data

import androidx.lifecycle.ViewModel

class PostreViewModel: ViewModel() {
    fun pillarPostre(): List<ComidaModel>{
        return ComidaProvider.loadComida().filter { it.type == 3 }
    }
}