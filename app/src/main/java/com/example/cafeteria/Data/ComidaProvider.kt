package com.example.cafeteria.Data

import com.example.cafeteria.R

class ComidaProvider {
    companion object{
    private var verComida= listOf(
        ComidaModel(1, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(2, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(3, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(4, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(5, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(6, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(4, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(5, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(6, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(4, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(5, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(6, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(4, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),
        ComidaModel(5, 1, R.drawable.bocadillo, "Bocadillo Kebab", 12.0),
        ComidaModel(6, 1, R.drawable.bocadillo, "Bocadillo Queso", 10.0),


        ComidaModel(7, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(8, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(9, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(10, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(11, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(12, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(10, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(11, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(12, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(10, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(11, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(12, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(10, 2, R.drawable.bebida, "Pepsi Zero", 2.0),
        ComidaModel(11, 2, R.drawable.bebida, "Kas naranja", 1.5),
        ComidaModel(12, 2, R.drawable.bebida, "Pepsi Zero", 2.0),

        ComidaModel(13, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(14, 3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(15, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(16, 3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(17, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(18 ,3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(16, 3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(17, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(18 ,3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(16, 3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(17, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(18 ,3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(16, 3, R.drawable.postre, "Tiramisú", 3.0),
        ComidaModel(17, 3, R.drawable.postre, "Tarta de queso", 4.0),
        ComidaModel(18 ,3, R.drawable.postre, "Tiramisú", 3.0),


        )
    fun loadComida(): List<ComidaModel> {
        return verComida
    }
    }
}