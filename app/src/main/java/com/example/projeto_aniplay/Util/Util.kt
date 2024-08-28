package com.example.projeto_aniplay.Util

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Util {
    companion object {
        fun ExibirMensagem(context: Context, mensagem:String){
            Toast.makeText(context, mensagem, Toast.LENGTH_LONG).show()
        }//fim do método ExibirMensagem
        fun ExibirMensagemSnack(context: Context, view: View, mensagem: String){
            Snackbar.make(context, view, mensagem, Snackbar.LENGTH_LONG)
        }
    }//fim do STATIC
}