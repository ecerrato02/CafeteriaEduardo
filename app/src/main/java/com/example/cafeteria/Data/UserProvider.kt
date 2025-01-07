package com.example.cafeteria.Data


class UserProvider {
    companion object{
        private var verUsuarios= mutableListOf(
            UserModel("Edu", "1234"),
            UserModel("Ivan", "1234"),
            UserModel("Michel", "1234"),
            UserModel("Marcos", "1234"),
            UserModel("Guilherme", "1234"),
        )

    fun loadUsuarios(usuario: String, contrasena: String): Boolean{
        var verificacion = (verUsuarios.find { it.nombre == usuario && it.contrasena == contrasena})
        if(verificacion == null){
            return false
        }
        return true
    }

    fun addUser(usuario: String, contrasena: String): Boolean{
        var verificacion = (verUsuarios.find { it.nombre == usuario && it.contrasena == contrasena})
        if(verificacion == null){
            verUsuarios.add(UserModel(usuario, contrasena))
            return true
        }
        return false
    }
    }
}