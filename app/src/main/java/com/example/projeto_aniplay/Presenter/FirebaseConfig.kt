package com.example.projeto_aniplay.Presenter

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class FirebaseConfig {
    companion object DatabaseConfig{
        var fbAuth = Firebase.auth
        var firestore = FirebaseFirestore.getInstance()

        fun getUserConnection(): FirebaseAuth {
            if(fbAuth != null){
                fbAuth = Firebase.auth
                return fbAuth
            }else{
                return fbAuth
            }
        }//fim do método GETUSERCONNECTION

        fun getFirestoreConnection(): FirebaseFirestore {
            if(firestore == null) {
                firestore = FirebaseFirestore.getInstance()
                return  firestore
            }else{
                return firestore
            }
        }
    }
}