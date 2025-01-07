package com.example.cafeteria.Data

import com.example.cafeteria.R

class ComidaProvider {
    var verComida= listOf(
        Comida(R.drawable.bocadillo, "Bocadillo Kebab", 12.0, 0),
        Comida(R.drawable.bocadillo, "Bocadillo Queso", 10.0, 0),

        )
    fun loadComida(): List<Comida> {
        return verComida
    }
}