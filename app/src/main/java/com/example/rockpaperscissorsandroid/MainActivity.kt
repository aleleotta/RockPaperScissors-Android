package com.example.rockpaperscissorsandroid

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rockpaperscissorsandroid.ui.theme.RockPaperScissorsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GamePage()
                }
            }
        }
    }
}

@Composable
fun GamePage(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /*TODO*/ }, modifier = modifier.size(100.dp).rotate(40F)) {
            Icon(painter = painterResource(id = R.drawable.scissors), contentDescription = "scissors", tint = Colors(R.drawable.scissors))
        }
        IconButton(onClick = { /*TODO*/ }, modifier = modifier.size(100.dp)) {
            Icon(painter = painterResource(id = R.drawable.paper), contentDescription = "scissors")
        }
        IconButton(onClick = { /*TODO*/ }, modifier = modifier.size(100.dp)) {
            Icon(painter = painterResource(id = R.drawable.stone), contentDescription = "scissors")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun test() {
    RockPaperScissorsAndroidTheme {
        GamePage()
    }
}