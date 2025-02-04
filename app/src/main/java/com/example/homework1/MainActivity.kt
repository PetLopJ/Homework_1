package com.example.homework1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homework1.ui.theme.Homework1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var s1 = Student("John","CPIS")

            Heading(h = "Heading")
            NormalText(t = "Normal Text")

            Surface (
                modifier = Modifier.fillMaxWidth().padding(40.dp),
                shape = RoundedCornerShape(10.dp),
                shadowElevation = 10.dp,
            ) {
                Column {
                    ShowStudent(s1)
                }
            }

//            Homework1Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }

//    }
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Homework1Theme {
//        Greeting("Android")
//    }
//}

// Homework 1 composable functions:

@Composable
fun Heading(h:String) {
    Text(text = h, color = (MaterialTheme.colorScheme.primary),
        fontWeight = (FontWeight.Bold),
        style = (MaterialTheme.typography.headlineMedium))
}

@Composable
fun NormalText(t:String) {
    Text(text = t,
        color = (Color.Magenta),
        style = (MaterialTheme.typography.headlineMedium))
}

@Composable
fun ShowStudent(s:Student) {

   println(s.name)
    println(s.major)

}

