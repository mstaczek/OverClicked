import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

@Preview
@Composable
fun PreviewMenuUI(){
    MainMenuUI({}, {})
}

@Composable
fun MainMenuUI(startGame: () -> Unit, exitApp: () -> Unit){
    Column(
        Modifier.fillMaxSize(),
        Arrangement.spacedBy(30.dp, Alignment.CenterVertically),
        Alignment.CenterHorizontally
    ) {
        Text(text = "OverClicked",
        fontSize = 3.em)

        Button(onClick = startGame) {
            Text(text = "Start game",
                fontSize = 1.5.em)
        }
        Button(onClick = exitApp) {
            Text(text = "Exit")
        }
    }
}