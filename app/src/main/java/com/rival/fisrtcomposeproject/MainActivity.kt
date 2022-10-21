package com.rival.fisrtcomposeproject



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rival.fisrtcomposeproject.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage("Selamat Pagi", "-rival" ,"Happy Birthday")
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithText(message: String, from: String, quote : String) {

    Column {
        Text(
            text = message,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(text = from,
            fontSize = 14.sp,
        )
        Text(text = quote,
            fontSize = 20.sp,
        )


    }

}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, quote: String) {

    val image = painterResource(R.drawable.androidparty)

    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
    
    BirthdayGreetingWithText(message = message, from = from, quote = quote)


}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayTheme {
        BirthdayGreetingWithImage("Happy Birthday", "From Rival", "Selamat Pagi")
    }
}


