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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
            List<courseInfo> = {}
            var student = Student("john", "fkf", )

            Surface {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally)   {
                    Modifier.padding(20.dp).shadow(30.dp)
                    RoundedCornerShape(10.dp)

                        MainScreen(Modifier.padding(innerPadding).fillMaxSize(),"Heading", "Normal Text")
                        StudentDisplay(student)
                        TotalButtons(student)
                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier:Modifier, heading:String, text:String) {
    Text(text = heading, color = (MaterialTheme.colorScheme.primary),
        fontWeight = (FontWeight.Bold),
        style = (MaterialTheme.typography.headlineMedium))
    Text(text = text , color = (Color.Magenta), style = (MaterialTheme.typography.bodyLarge))
}

@Composable
fun StudentDisplay(student:Student) {
    Text(text = student.name)
    Text(text = student.major)

}

@Composable
fun CourseDisplay(course:String, start:String, end:String) {

}

@Composable
fun TotalButton(s:Student) {
    // Should use a surface
    Modifier.padding(20.dp).shadow(30.dp)
    Shapes(RoundedCornerShape(10.dp))
    Button(onClick = {}) {Text("Total Credits") }


}


