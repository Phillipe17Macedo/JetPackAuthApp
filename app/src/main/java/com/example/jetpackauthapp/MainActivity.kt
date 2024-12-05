package com.example.jetpackauthapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.jetpackauthapp.ui.LoginScreen
import com.example.jetpackauthapp.ui.WelcomeScreen
import com.example.jetpackauthapp.ui.theme.ComposeAuthAppTheme
import com.example.jetpackauthapp.viewModel.AuthViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAuthAppTheme {
                AuthApp()
            }
        }
    }
}

@Composable
fun AuthApp() {
    val viewModel: AuthViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
    val user = viewModel.currentUser
    if (user != null) {
        WelcomeScreen(user.email ?: "User", viewModel)
    } else {
        LoginScreen(viewModel)
    }
}