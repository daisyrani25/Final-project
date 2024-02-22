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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject.ui.theme.ThemeColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
    fun UpperPanel()

{

        Column(

            modifier = Modifier
                .background(ThemeColor.green)
                //.fillMaxWidth(0.63f)
                .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Text(
                text = "Little Lemon",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = ThemeColor.yellow
            )
           Text(
                text = "Chicago",
                fontSize = 24.sp,
                color = ThemeColor.cloud
            )
             
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {

                Text(
                    text = "We are a family-owned Mediterranean restaurant, focused on traditional recipes served with a modern twist",
                    style = MaterialTheme.typography.body1,
                    color =ThemeColor.cloud,
                    modifier = Modifier
                        .padding(bottom = 28.dp, end = 20.dp)
                        .fillMaxWidth(0.6f)
                )
               Image(
                    painter = painterResource(id = R.drawable.upperpanelimage),
                    contentDescription = "Upper Panel Image",
                    modifier = Modifier.clip(RoundedCornerShape(10.dp))
                )}
 val txt = remember { mutableStateOf(value = "") }
                TextField(
                    value = txt.value, onValueChange = {txt.value=it},

                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(40.dp)
                        .background(color = Color(0xFFEDEFEE)),
                    placeholder = { Text(text = "Enter the Phrase")}
                )
/* val txt = remember { mutableStateOf(value = "") }
TextField(value = txt.value, onValueChange = {txt.value = it},

    modifier = Modifier
        .fillMaxWidth(),

    placeholder = { Text("Enter Search Phrase") })*/


}
}

@Composable
fun DisplayMenus1()
{
    Row {
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            shape= CircleShape,
            colors = ButtonDefaults.buttonColors(
                Color(0xFFF4CE14)
            )

        ) {
            Text(
                text = "Starters",
                color = Color(0xFFEDEFEE)
            )
        }


  }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        thickness = 1.dp,
        color = ThemeColor.yellow
    )
}
@Preview(showBackground = true)
@Composable
fun UpperPanelPreview() {
UpperPanel()
}
@Preview(showBackground = true)
@Composable
fun DisplayMenus1Preview() {
    DisplayMenus1()
}