package com.example.projeto_aniplay.Presenter

import android.content.Context
import com.example.projeto_aniplay.Model.UserModel
import com.example.projeto_aniplay.Util.Util
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class UserPresenter {
    var bd = FirebaseConfig.getUserConnection()
    var bdFS = FirebaseConfig.getFirestoreConnection()

    fun CadastroUsuario(usuario: UserModel){
        bd.createUserWithEmailAndPassword(usuario.login.toString(), usuario.senha.toString())
    }
    fun ResetPass(email:String){
        Firebase.auth.sendPasswordResetEmail(email)
    }
    fun Logout(){
        if (bd.currentUser != null){
            bd.signOut()
        }
    }

    fun CadastroPessoa(context: Context, usuarioModel: UserModel){
        bdFS.collection("Usuarios").document(usuarioModel.login.toString()).get()
            .addOnSuccessListener { sucesso ->
                if(sucesso.exists()){
                    Util.ExibirMensagem(context, "Dados não cadastrados: Este usuário já existe.")
                }else{
                    bdFS.collection("Pessoa").document(usuarioModel.login.toString()).set(usuarioModel)
                        .addOnSuccessListener {
                                sucesso -> Util.ExibirMensagem(context, "Dados cadastrados com sucesso.")
                        }.addOnFailureListener {
                                erro -> Util.ExibirMensagem(context, "Dados não cadastrados:${erro.message.toString()}")
                        }
                }
            }
    }
}