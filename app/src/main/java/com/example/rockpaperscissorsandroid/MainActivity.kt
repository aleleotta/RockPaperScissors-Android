package com.example.rockpaperscissorsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rockpaperscissorsandroid.ui.theme.RockPaperScissorsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsAndroidTheme {
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
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            verticalAlignment = Alignment.Vertical { size, space -> 250 }
        ) {
            Text(
                text = "Pick an element!",
                fontSize = 25.sp,
                fontWeight = FontWeight.Medium,
            )
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            TextButton(onClick = { /*TODO*/ }, modifier = modifier.size(120.dp),
                content = {
                    Image(painter = painterResource(id = R.drawable.stone),
                        contentDescription = "stone",
                        modifier = modifier.size(100.dp)
                    )
                }
            )
            TextButton(onClick = { /*TODO*/ }, modifier = modifier.size(120.dp),
                content = {
                    Image(painter = painterResource(id = R.drawable.paper),
                        contentDescription = "paper",
                        modifier = modifier.size(90.dp)
                    )
                }
            )
            TextButton(onClick = { /*TODO*/ }, modifier = modifier.size(120.dp),
                content = {
                    Image(painter = painterResource(id = R.drawable.scissors),
                        contentDescription = "scissors",
                        modifier = modifier
                            .size(100.dp)
                            .rotate(40F)
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Test() {
    RockPaperScissorsAndroidTheme {
        GamePage()
    }
}