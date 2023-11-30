package com.fajar.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fajar.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent{
           HelloJetpackComposeTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   Greeting("Jetpack Compose")
               }
           }
       }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier){
        Row (
            modifier  = Modifier.padding(8.dp),
            verticalAlignment  = Alignment.CenterVertically
        ){

            Image(
                painter = painterResource(R.drawable.jetpack_compose),
                contentDescription = "Logo Jetpack compose",
                modifier = Modifier.size(80.dp)

            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Hello $name",
                    modifier = modifier,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "Welcome to Dicoding")
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        HelloJetpackComposeTheme {
            Greeting("Jetpack Compose")
        }
    }


}

