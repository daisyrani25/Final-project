package com.example.finalproject

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.finalproject.ui.theme.ThemeColor

@Composable
fun Home(navController: NavHostController)
{
Row() {

    Image(painter = painterResource(id = R.drawable.mainlogo), contentDescription = "",
        modifier = Modifier
            .fillMaxWidth(0.9F)
            .padding(horizontal = 5.dp)
            .size(40.dp))


    IconButton(onClick = { navController.navigate(Profile.route) }) {
Image(painter = painterResource(id = R.drawable.profile), contentDescription = "",
    modifier = Modifier

        .size(45.dp))
    }

}

        }



/*@Preview(showBackground = true)
@Composable
fun HomePreview() {

    FinalprojectTheme(){
        Home(navController)
    }
}*/