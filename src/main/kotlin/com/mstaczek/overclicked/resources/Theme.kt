package com.mstaczek.overclicked.resources

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val MyColors = lightColors(
    primary = Color(0xFF598392),
    primaryVariant = Color(0xFF598392),
    secondary = Color(0xFFAEC3B0),
    secondaryVariant = Color(0xFFAEC3B0),
    background = Color(0xFFEFF6E0),
    surface = Color(0xFFEFF6E0),
    onPrimary = Color(0xFFEFF6E0),
    onSecondary = Color(0xFF124559),
    onBackground = Color(0xFF01161E),
    onSurface = Color(0xFF01161E),
    onError = Color.White
)

@Composable
fun MyCustomTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(colors = MyColors) {
        Surface(color = MyColors.background){
            content()
        }
    }
}