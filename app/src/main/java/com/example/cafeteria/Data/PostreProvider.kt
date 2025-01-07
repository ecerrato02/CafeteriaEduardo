package com.example.cafeteria.Data

import com.example.cafeteria.R

class PostreProvider {
    var verPostre= listOf(
        Postre(R.drawable.bocadillo, "Tarta de queso", 4.0, 0),
        Postre(R.drawable.bocadillo, "Tiramisú", 3.0, 0),

        )
    fun loadBebidas(): List<Postre> {
        return verPostre
    }
}