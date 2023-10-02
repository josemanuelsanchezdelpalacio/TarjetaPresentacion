package com.damjms.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.damjms.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFB366))
            .padding(bottom = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Contenedor para la imagen y el texto
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(200.dp)
            )

            Text(
                text = "TARJETA DE PRESENTACION",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 16.dp) // Espaciador entre la imagen y el texto
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            Icon(Icons.Rounded.Call, contentDescription = "")
            Text(
                text = "(+34) 974 33 22 11",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            Icon(Icons.Rounded.Share, contentDescription = "")
            Text(
                text = "@AndroidDev",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            Icon(Icons.Rounded.Email, contentDescription = "")
            Text(
                text = "170068@iessanalberto.com",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic
            )
        }
    }
}