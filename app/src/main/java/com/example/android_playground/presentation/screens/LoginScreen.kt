package com.example.android_playground.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    Column {
        Text("Login screen")
    }
}