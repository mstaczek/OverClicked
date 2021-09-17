package com.mstaczek.overclicked.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.mstaczek.overclicked.controllers.GameController


@Preview
@Composable
fun PreviewGameUI(){
    MainGameUI {}
}

@Composable
fun MainGameUI(returnToMenu: () -> Unit){
    val game = remember { GameController() }
    Column(
        Modifier.fillMaxSize(),
        Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
        Alignment.CenterHorizontally
    ) {
        Button(enabled = !game.finished, onClick = {game.clicked()}) {
            Text(
                when{
                    !game.allowRestarts -> "Enough! Stop!"
                    game.finished -> "Good job!"
                    game.count == 0 -> "Press me!"
                    game.count <= 10 -> "${game.count}"
                    else -> "Keep going!"
                },
                modifier = Modifier.width(150.dp),
                textAlign = TextAlign.Center,
                fontSize = 1.5.em
            )
        }
        if(game.finished){
            Button(enabled = game.allowRestarts, onClick = {game.restart()}) {
                Text(
                    when {
                        game.allowRestarts -> "Play again!"
                        else -> "Stop addiction!"
                    }
                )
            }
        }
        else{
            Spacer(modifier = Modifier.height(35.dp))
        }
        Button(onClick = returnToMenu
        ) {
            Text("Return to menu")
        }
    }
}