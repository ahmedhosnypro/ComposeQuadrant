package com.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen()
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Quadrant Screen"
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        QuadrantScreen()
    }
}

@Composable
fun QuadrantScreen() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantInfoCard(
                title = "Quadrant 1",
                description = "This is Quadrant 1",
                modifier = Modifier.weight(1f),
                Color(0xFFEADDFF)
            )
            QuadrantInfoCard(
                title = "Quadrant 2",
                description = "This is Quadrant 2",
                modifier = Modifier.weight(1f),
                Color(0xFFD0BCFF)
            )
        }

        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            QuadrantInfoCard(
                title = "Quadrant 3",
                description = "This is Quadrant 3",
                modifier = Modifier.weight(1f),
                Color(0xFFB69DF8)
            )
            QuadrantInfoCard(
                title = "Quadrant 4",
                description = "This is Quadrant 4",
                modifier = Modifier.weight(1f),
                Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun QuadrantInfoCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}