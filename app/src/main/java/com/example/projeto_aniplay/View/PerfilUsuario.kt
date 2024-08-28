package com.example.projeto_aniplay.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projeto_aniplay.Model.UserModel
import com.example.projeto_aniplay.R
import com.example.projeto_aniplay.databinding.ActivityHomeBinding
import com.example.projeto_aniplay.databinding.ActivityPerfilUsuarioBinding

class PerfilUsuario : AppCompatActivity() {
    lateinit var bind:ActivityPerfilUsuarioBinding
    lateinit var band:ActivityHomeBinding
    var pessoamodel = UserModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityPerfilUsuarioBinding.inflate(layoutInflater)

        setContentView(bind.root)
        setContentView(band.root)
    }
}