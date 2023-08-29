package com.example.tela_sugestao_nomes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tela_sugestao_nomes.ui.theme.Tela_sugestao_nomesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tela_sugestao_nomesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    stringResource(id = R.string.suggestion),
                    fontSize = 20.sp,
                    textAlign = TextAlign.End,
                    color = Color(61,61,61),
                    fontWeight = FontWeight.ExtraBold
                )

            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                ) {
                    Text(text = "Todos")
                }
                Row(
                    modifier = Modifier.padding(8.dp),
                ) {
                    Text(text = "Favoritos")
                }
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color(209, 209, 214))) {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .height(3.2.dp)
                        .background(
                            Color(182, 182, 246),
                            shape = RoundedCornerShape(
                                topStart = 2.dp,
                                topEnd = 2.dp,
                                bottomStart = 2.dp,
                                bottomEnd = 2.dp
                            )
                        )

                ) {

                }

                Column(
                    modifier = Modifier
                        .width(100.dp)
                        .height(3.2.dp)
                        .background(
                            Color(182, 182, 246),
                            shape = RoundedCornerShape(
                                topStart = 2.dp,
                                topEnd = 2.dp,
                                bottomStart = 2.dp,
                                bottomEnd = 2.dp
                            )
                        )

                ) {

                }
            }


        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .size(width = 120.dp, height = 60.dp)
                    .padding(vertical = 9.dp, horizontal = 4.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(width = 2.dp ,Color(182,182,246))
                ){
                Image(
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally,),
                    painter = painterResource(id = R.drawable.gender_baixo),
                    contentDescription = null
                )
            }

            Card(
                modifier = Modifier
                    .size(width = 120.dp, height = 60.dp)
                    .padding(vertical = 9.dp, horizontal = 4.dp),
                colors = CardDefaults.cardColors(Color(182,182,246)),
                shape = RoundedCornerShape(50.dp)
            ){
                Image(
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally,),
                    painter = painterResource(id = R.drawable.gender_cima),
                    contentDescription = null
                )
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .padding(start = 15.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .size(width = 60.dp, height = 50.dp)
                    .padding(vertical = 9.dp, horizontal = 4.dp),
                colors = CardDefaults.cardColors(Color(182, 182, 246)),
                shape = RoundedCornerShape(50.dp),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "A",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(5.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(width = 350.dp, height = 130.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(20.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )

                    }

                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )

                    }

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )

                    }

                }

            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .padding(start = 15.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .size(width = 60.dp, height = 50.dp)
                    .padding(vertical = 9.dp, horizontal = 4.dp),
                colors = CardDefaults.cardColors(Color(182, 182, 246)),
                shape = RoundedCornerShape(50.dp),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "B",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(5.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(width = 350.dp, height = 130.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(20.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )

                    }

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )

                    }

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )

                    }

                }

            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .padding(start = 15.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .size(width = 60.dp, height = 50.dp)
                    .padding(vertical = 9.dp, horizontal = 4.dp),
                colors = CardDefaults.cardColors(Color(182, 182, 246)),
                shape = RoundedCornerShape(50.dp),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "C",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(5.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(width = 350.dp, height = 60.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(20.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_cinza),
                            contentDescription = null
                        )
                    }

                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            text = "Alessandro",
                            fontSize = 20.sp
                        )
                        Image(
                            modifier = Modifier.padding(top = 3.dp),
                            painter = painterResource(id = R.drawable.coracao_roxo),
                            contentDescription = null
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Tela_sugestao_nomesTheme {
        Greeting("Android")
    }
}