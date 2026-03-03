package com.example.ibrahimabdalhady_120222385

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.example.ibrahimabdalhady_120222385.ui.theme.IbrahimAbdAlHady_120222385Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IbrahimAbdAlHady_120222385Theme {

                // اي شاشة بدها تشغيل فقط شيلي التعليق وشغليها

                MidExamScreen()
//                FacultiesScreen()
//                LoginScreen()


            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IbrahimAbdAlHady_120222385Theme {
        Greeting("Android")
    }
}

