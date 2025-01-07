package com.example.cafeteria

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil

import com.example.cafeteria.Data.UserViewModel
import com.example.cafeteria.databinding.ActivityRegistreBinding

class Registre : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registre)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val binding : ActivityRegistreBinding = DataBindingUtil.setContentView(this, R.layout.activity_registre)

        binding.botonCrear.setOnClickListener(){
            if(binding.registroNombre.text.toString().isEmpty() || binding.registroContra.text.toString().isEmpty()){
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show()
            }else {
                if(viewModel.registro(binding.registroNombre.text.toString(), binding.registroContra.text.toString())){
                    Toast.makeText(this, "Cuenta creada correctamente", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, Login::class.java))
                } else {
                    Toast.makeText(this, "Usuario existente", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
