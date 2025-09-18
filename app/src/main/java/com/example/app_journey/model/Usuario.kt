package com.example.app_journey.model

data class Usuario(
    val id_usuario: Int = 0,
    val nome: String = "",
    val sobrenome: String = "",
    val email: String = "",
    val senha: String = "",
    val palavra_chave: String = "",
    val linkedin_url: String = ""
)
data class SenhaRequest(
    val senha: String = ""
)