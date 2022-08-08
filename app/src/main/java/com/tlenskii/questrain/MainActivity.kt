package com.tlenskii.questrain

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tlenskii.questrain.ui.theme.QuesTrainTheme
import java.util.*

sealed class Screen {
    object Start : Screen()
    object Screen1 : Screen()
    object Screen2 : Screen()
    object Screen3 : Screen()
    object Screen4 : Screen()
    object Screen5 : Screen()
    object Screen6 : Screen()
    object Screen7 : Screen()
    object Screen8 : Screen()
    object Screen9 : Screen()
    object Screen10 : Screen()
    object Screen11 : Screen()
    object Screen12 : Screen()
    object Screen13 : Screen()
    object Screen14 : Screen()
    object Screen15 : Screen()
    object Screen16 : Screen()
    object Screen17 : Screen()
    object Screen18 : Screen()
}

class MainActivity : ComponentActivity() {

    private var navController: NavHostController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.ic_background_image),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )
                Scaffold(modifier = Modifier.fillMaxSize(), backgroundColor = Color.Transparent,
                    topBar = {
                        AppBar()
                    }) {
                    navController?.also {
                        NavHost(
                            navController = it,
                            startDestination = Screen.Start.toString()
                        ) {
                            composable(Screen.Start.toString()) {
                                StartScreen()
                            }
                            composable(Screen.Screen1.toString()) {
                                Screen1()
                            }
                            composable(Screen.Screen2.toString()) {
                                Screen2()
                            }
                            composable(Screen.Screen3.toString()) {
                                Screen3()
                            }
                            composable(Screen.Screen4.toString()) {
                                Screen4()
                            }
                            composable(Screen.Screen5.toString()) {
                                Screen5()
                            }
                            composable(Screen.Screen6.toString()) {
                                Screen6()
                            }
                            composable(Screen.Screen7.toString()) {
                                Screen7()
                            }
                            composable(Screen.Screen8.toString()) {
                                Screen8()
                            }
                            composable(Screen.Screen9.toString()) {
                                Screen9()
                            }
                            composable(Screen.Screen10.toString()) {
                                Screen10()
                            }
                            composable(Screen.Screen11.toString()) {
                                Screen11()
                            }
                            composable(Screen.Screen12.toString()) {
                                Screen12()
                            }
                            composable(Screen.Screen13.toString()) {
                                Screen13()
                            }
                            composable(Screen.Screen14.toString()) {
                                Screen14()
                            }
                            composable(Screen.Screen15.toString()) {
                                Screen15()
                            }
                            composable(Screen.Screen16.toString()) {
                                Screen16()
                            }
                            composable(Screen.Screen17.toString()) {
                                Screen17()
                            }
                            composable(Screen.Screen18.toString()) {
                                Screen18()
                            }
                        }

                    }
                }
            }
        }
    }


    @Composable
    fun AppBar(isBackArrowEnabled: Boolean = false) {
        TopAppBar() {
            Spacer(modifier = Modifier.size(10.dp))
            if (isBackArrowEnabled) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    modifier = Modifier.clickable { navController?.popBackStack() })
            }
            Text(
                text = getString(R.string.app_name),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }

    @Composable
    fun StartScreen() {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.start)
                )
                Button(
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    onClick = { navController?.navigate(Screen.Screen1.toString()) }) {
                    Text(color = Color.White, text = "ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen1() {
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen1)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text=="ну ок"){
                            navController?.navigate(Screen.Screen2.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen2(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen2)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text=="160"){
                            navController?.navigate(Screen.Screen3.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen3(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen3)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() =="макинтош"){
                            navController?.navigate(Screen.Screen4.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen4(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen4)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() in arrayOf("рурский котел","рурский котёл")){
                            navController?.navigate(Screen.Screen5.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen5(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen5)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() =="камень"){
                            navController?.navigate(Screen.Screen6.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen6(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen6)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                            navController?.navigate(Screen.Screen7.toString())
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen7(){//TODO поставить картинку
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Image(painterResource(id = R.drawable.quest),"")
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen7)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() =="сицилия"){
                            navController?.navigate(Screen.Screen8.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen8(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen8)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() in arrayOf("beowulf","беовульф","beowoolf")){
                            navController?.navigate(Screen.Screen9.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen9(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen9)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() =="дарт вейдер"){
                            navController?.navigate(Screen.Screen10.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen10(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen10)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase() =="этикет"){
                            navController?.navigate(Screen.Screen11.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen11(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen11)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.lowercase().replace(" ","") =="донателло,леонардо,микеланджело,рафаэль"){
                            navController?.navigate(Screen.Screen12.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen12(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen12)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.trim().isNotEmpty()){
                            navController?.navigate(Screen.Screen13.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen13() {
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen13)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                            navController?.navigate(Screen.Screen14.toString())
                    }) {
                    Text("Я ПОКИНУЛ СОСТАВ (НО НЕ УШЕЛ С ПЛАТФОРМЫ)")
                }
            }
        }
    }

    @Composable
    fun Screen14(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen14)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                            navController?.navigate(Screen.Screen15.toString())
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen15(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen15)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                            navController?.navigate(Screen.Screen16.toString())
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen16(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen16)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                            navController?.navigate(Screen.Screen17.toString())
                    }) {
                    Text("Я ЗАШЕЛ В ЭЛЕКТРИЧКУ")
                }
            }
        }
    }

    @Composable
    fun Screen17(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen17)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        if(text.isNotEmpty()){
                            navController?.navigate(Screen.Screen18.toString())
                        }
                    }) {
                    Text("ДАЛЬШЕ")
                }
            }
        }
    }

    @Composable
    fun Screen18(){
        var text by remember { mutableStateOf("") }
        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                        .background(Color(R.color.text_background)),
                    text = getString(R.string.screen18)
                )
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp))
                OutlinedTextField(colors = TextFieldDefaults.outlinedTextFieldColors(
                    disabledBorderColor = Color.White,
                    focusedBorderColor = Color.White,
                    placeholderColor = Color.White,
                    textColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    errorBorderColor = Color.White
                ),
                    modifier = Modifier
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                    placeholder = { Text("ОТВЕТ") },
                    value = text,
                    onValueChange = { text = it })
                Spacer(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                )
                Button(modifier = Modifier
                    .width(250.dp)
                    .align(Alignment.CenterHorizontally),
                    onClick = {
                        Toast.makeText(this@MainActivity,"С ДР, КОРОЧ!",Toast.LENGTH_LONG ).show()
                    }) {
                    Text("УРА!")
                }
            }
        }
    }

    override fun onBackPressed() {

    }
}
