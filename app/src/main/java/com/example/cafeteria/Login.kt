package com.example.cafeteria

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.cafeteria.Data.UserViewModel
import com.example.cafeteria.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.botonInicio.setOnClickListener() {
                if (viewModel.login(binding.campoNombre.text.toString(), binding.campoContra.text.toString())) {

                    Toast.makeText(this, "Sesión iniciada", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))

                } else Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show()
        }
        binding.botonRegistro.setOnClickListener(){
            startActivity(Intent(this, Registre::class.java))
        }
    }
}