package com.example.projeto_aniplay.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projeto_aniplay.Model.UserModel
import com.example.projeto_aniplay.Presenter.UserPresenter
import com.example.projeto_aniplay.R
import com.example.projeto_aniplay.Util.Util
import com.example.projeto_aniplay.databinding.ActivityFormCadastroBinding

class FormCadastro : AppCompatActivity() {
    lateinit var  bind : ActivityFormCadastroBinding
    private var usuario = UserModel()
    var usuarioPresenter = UserPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btCadastrar.setOnClickListener {
            if(validaCampo()){
                Toast.makeText(this, "Liberado para realizar o cadastro", Toast.LENGTH_LONG).show()
                usuario.login = bind.edtEmail.text.toString()
                usuario.senha = bind.edtSenha.text.toString().toInt()
                usuarioPresenter.CadastroUsuario(usuario)
                usuario.nome = bind.edtNome.text.toString()
                usuario.login = bind.edtEmail.text.toString()
                usuarioPresenter.CadastroPessoa(this, usuario)
                Util.ExibirMensagem(this, "Usuário cadastrada com sucesso.")
            }else{
                Toast.makeText(this, "Preencha os campos", Toast.LENGTH_LONG).show()
            }
        }//fim do btSignup SETONCLICKLISTENER
    }

    private fun validaCampo():Boolean{
        if(!bind.edtEmail.text.toString().isEmpty() && !bind.edtSenha.text.toString().isEmpty()){
            return true
        }else{
            return false
        }
    }//fim do método VALIDACAMPO

}