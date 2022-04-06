package com.example.introcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.introcompose.ui.theme.IntroComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroComposeTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}


@Composable
fun MyApp() {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
    color = Color(0xFF546E7A)
    ) {
    }
}

@Preview
@Composable
fun CreateCircle() {
    Card(modifier = Modifier
        .padding(3.dp)
        .size(100.dp),
    shape = CircleShape) {
        
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Tap!")
        }

        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IntroComposeTheme {
        MyApp()
    }
}