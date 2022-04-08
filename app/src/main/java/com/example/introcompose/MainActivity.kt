package com.example.introcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        color = Color(0xFF546E7A)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "$100", style = TextStyle(
                color = Color.White,
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold
            ))
            Spacer(modifier = Modifier.height(100.dp))
            CreateCircle()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun CreateCircle() {
    var moneyCounter = remember {
        mutableStateOf(0)
    }

    Card(modifier = Modifier
        .padding(3.dp)
        .size(100.dp),
        shape = CircleShape,
        onClick = {
            moneyCounter.value++
            Log.d("Counter", "Count: $moneyCounter")
        }) {

        Box(contentAlignment = Alignment.Center) {
            Text(text = "Tap! ${moneyCounter.value}")
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