package com.example.cafeteria.Data

import androidx.lifecycle.ViewModel

class MenjarViewModel : ViewModel()
{
    fun pillarComida(): List<ComidaModel>{
        return ComidaProvider.loadComida().filter { it.type == 1 }
    }
}