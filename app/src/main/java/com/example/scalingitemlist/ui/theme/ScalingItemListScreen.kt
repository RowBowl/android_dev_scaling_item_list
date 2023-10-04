package com.example.scalingitemlist.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

enum class CardExpandedState {
    Expanded,
    Halfway,
    Collapsed
}



@Composable
fun ScalingItemListScreen() {
    var cardState by remember{ mutableStateOf(CardExpandedState.Expanded) }


    Column (
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(16.dp)
    ){
        ListItemCard(
            mode = cardState,
            text = "testing 1",
            modifier = Modifier.fillMaxSize()
        )
    }

}

@Composable
fun ListItemCard(mode: CardExpandedState,
                 text: String,
                 modifier: Modifier = Modifier) {
    Card (
        modifier = modifier
    ) {
        Column (
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = text,
                style = MaterialTheme.typography.displayMedium
            )
        }
    }
}

@Preview
@Composable
fun ScalingItemLlistScreenPreview() {
    ScalingItemListTheme {
        // A surface container using the 'background' color from the theme
        ScalingItemListScreen()
    }
}
