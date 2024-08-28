package com.example.projeto_aniplay.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projeto_aniplay.Presenter.UserPresenter
import com.example.projeto_aniplay.R
import com.example.projeto_aniplay.databinding.ActivityRedefinirSenhaBinding

class Redefinir_senha : AppCompatActivity() {
    lateinit var bind: ActivityRedefinirSenhaBinding
    var userPresenter = UserPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityRedefinirSenhaBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btEnviar.setOnClickListener {
            userPresenter.ResetPass(bind.edtEmail.text.toString()
            )
        }
    }
}