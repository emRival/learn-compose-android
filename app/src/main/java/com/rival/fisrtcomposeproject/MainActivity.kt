package com.rival.fisrtcomposeproject



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rival.fisrtcomposeproject.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage("Selamat Pagi", "-rival" )
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithText(message: String, from: String) {

    Column {
        Text(
            text = message,
            fontSize = 30.sp,
        )
        Text(text =from,
            fontSize = 14.sp,
        )
    }

}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {

    val image = painterResource(R.drawable.androidparty)

    Box {
        Image(
            painter = image,
            contentDescription = null
        )
    }
    
    BirthdayGreetingWithText(message = message, from = from )


}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayTheme {
        BirthdayGreetingWithImage("Happy Birthday", "From Rival")
    }
}

