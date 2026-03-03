package com.example.ibrahimabdalhady_120222385

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun LoginScreen(){

        var email by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier = Modifier.padding(16.dp)
        )

        OutlinedTextField(

            value = email,

            onValueChange = {
                email = it
            },

            label = {
                Text("Email")
            },

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(
            modifier = Modifier.padding(8.dp)
        )

        OutlinedTextField(

            value = password,

            onValueChange = {
                password = it
            },

            label = {
                Text("Password")
            },

            visualTransformation = PasswordVisualTransformation(),

            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(28.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6A4CAF)
            ),
            shape = MaterialTheme.shapes.large
        ) {
            Text(
                text = "Login",
                color = Color.White
            )
        }

    }
}