package com.example.projeto_aniplay.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.projeto_aniplay.Presenter.FirebaseConfig
import com.example.projeto_aniplay.R
import com.example.projeto_aniplay.Util.Util
import com.example.projeto_aniplay.databinding.ActivityFormLoginBinding

class FormLogin : AppCompatActivity(), View.OnClickListener {
    lateinit var bind: ActivityFormLoginBinding
    var bd = FirebaseConfig.getUserConnection()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btCadastro.setOnClickListener(this)
        bind.btEntrar
    }

    override fun onClick(v: View?) {
        when(v?.id){
            bind.btCadastro.id -> {
                startActivity(Intent(this, FormCadastro::class.java))
                Util.ExibirMensagem(this, "Seja bem-vindo a tela de cadastro!")
            }//Inicia a tela de Cadastro
            bind.btEntrar.id -> {
                bd.signInWithEmailAndPassword(bind.edtLogin.text.toString(), bind.edtSenha.text.toString())
                    .addOnSuccessListener { sucesso -> startActivity(Intent(this, MainActivity::class.java)); Util.ExibirMensagem(this, "Bem-vindo!")}
                    .addOnFailureListener { erro -> Util.ExibirMensagem(this, "Algo deu errado, verifique suas credenciais e tente novamente.") }
            }//Login
            bind.btPassReset.id -> {
                startActivity(Intent(this, Redefinir_senha::class.java))
            }//Alterar senha
        }//when
    }//onClick
}