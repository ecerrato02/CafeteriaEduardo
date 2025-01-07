package com.example.cafeteria.Data

import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel(){
    fun login(username: String, contrasena: String): Boolean{
        return UserProvider.loadUsuarios(username, contrasena)
    }

    fun registro(username: String, contrasena: String): Boolean{
        return UserProvider.addUser(username, contrasena)
    }
}