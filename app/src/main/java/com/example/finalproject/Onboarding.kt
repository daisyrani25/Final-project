package com.example.finalproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject.ui.theme.FinalprojectTheme
import com.example.finalproject.ui.theme.ThemeColor

@Composable
fun Onboard() {


    var first= remember {
        mutableStateOf(value = "")
    }
    var last= remember {
        mutableStateOf(value = "")
    }
    var email1= remember {
        mutableStateOf(value = "")
    }
    Column {

        Image(painter = painterResource(id = R.drawable.mainlogo), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(0.95F)
                .padding(horizontal = 20.dp)
                .heightIn(40.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .background(ThemeColor.green),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "Let's Get to Know you",
                        modifier = Modifier.heightIn(40.dp)
            )
           }
            Text(
                text = "Personal Information",
                fontSize = 20.sp
            )
        Spacer(modifier = Modifier.heightIn(50.dp))
            Text(
                text = "First Name",
                fontSize = 20.sp
            )
            TextField(
                value = first.value, onValueChange = {first.value=it},

                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(40.dp)
            )
        Spacer(modifier = Modifier.heightIn(40.dp))
            Text(
                text = "Last Name",
                fontSize = 20.sp
            )
        TextField(value = last.value, onValueChange = {last.value=it},
                Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.heightIn(40.dp))
            Text(
                text = "Email",
                fontSize = 20.sp
            )

        TextField(value = email1.value, onValueChange = {newvalue2->email1.value=newvalue2},
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(40.dp)

        )
        Spacer(modifier = Modifier.heightIn(200.dp))
            Button(
                onClick = {
//navController.navigate(Profile.route)
                },
                modifier = Modifier.fillMaxWidth(),
                shape= CircleShape,
                colors = ButtonDefaults.buttonColors(
                    Color(0xFFF4CE14)
                )
            ) {
                Text(
                    text = "Register",
                    color = Color(0xFFEDEFEE)
                )
            }

    }
}


@Preview(showBackground = true)
@Composable
fun OnboardPreview() {

         FinalprojectTheme(){
         Onboard()
    }
}
