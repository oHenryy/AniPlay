package com.example.projeto_aniplay.Model

class UserModel {
    var nome: String?
    var login: String?
    var senha: Int?

    constructor() {
        this.nome = null
        this.login = null
        this.senha = null
    }
    constructor(nome:String, login:String, senha:Int){
        this.nome = nome
        this.login = login
        this.senha = senha
    }
}