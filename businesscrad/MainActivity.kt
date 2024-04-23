package com.example.businesscrad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscrad.ui.theme.BusinessCradTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCradTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    BusinessDetails(
                        fullName = "THE PC DOCTOR",
                        title = "Computer repair",
                        contactNumber = "+27 657495944",
                        email = "www.msalelaafikile@gmail.com",
                        facebookPage = "Afikile24_M"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessDetails(fullName: String, title: String, contactNumber:String, email: String, facebookPage: String, modifier: Modifier = Modifier)
{
    Column (
        modifier= modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,)
    {
        val image = painterResource(R.drawable.computerepair)
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = fullName,
            fontSize = 25.sp,
            lineHeight = 28.sp,
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = title,
            fontSize = 12.sp,
            modifier = Modifier.padding(4.dp)
        )
    }
    Column (modifier= modifier)
    {
        val image = painterResource(R.drawable.call)
        Image(
            painter = image, contentDescription = null)

        Row {
            Text(
                text = contactNumber,
                fontSize = 10.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
    Column (modifier= modifier)
    {
        val image = painterResource(R.drawable.email)
        Image(
            painter = image, contentDescription = null)

        Row {
            Text(
                text = email,
                fontSize = 10.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
    Column (modifier= modifier)
    {
        val image = painterResource(R.drawable.facebook)
        Image(
            painter = image, contentDescription = null)

        Row {
            Text(
                text = facebookPage,
                fontSize = 10.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
    }




}

@Preview(showBackground = true)
@Composable
fun BusinessDetailsPreview() {
    BusinessCradTheme {
        BusinessDetails(
            fullName = "THE PC DOCTOR",
            title = "Computer repair",
            contactNumber = "+27 657495944",
            email = "www.msalelaafikile@gmail.com",
            facebookPage = "Afikile24_M")
    }
}