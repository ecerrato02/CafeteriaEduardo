package com.example.cafeteria.Data

import com.example.cafeteria.R

class BebidaProvider {
    var verBebidas= listOf(
        Bebida(R.drawable.bocadillo, "Kas naranja", 1.5, 0),
        Bebida(R.drawable.bocadillo, "Pepsi Zero", 2.0, 0),

    )
    fun loadBebidas(): List<Bebida> {
        return verBebidas
    }
}