package com.example.app_journey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app_journey.screens.Cadastro
import com.example.app_journey.screens.Login
import com.example.app_journey.screens.RecuperacaoSenha
import com.example.app_journey.screens.RedefinirSenha
import com.example.app_journey.utils.SharedPrefHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navegacao = rememberNavController()
            val context = applicationContext

            val rotaInicial = if (SharedPrefHelper.obterEmail(context) != null) {
                "perfil"
            } else {
                "login"
            }

            NavHost(
                navController = navegacao,
                startDestination = rotaInicial
            ) {
                composable(route = "login") { Login(navegacao) }
                composable(route = "cadastro") { Cadastro(navegacao) }
                composable(route = "recureracao_senha") { RecuperacaoSenha(navegacao) }

            }
        }
    }
}