package com.mstaczek.overclicked

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.mstaczek.overclicked.controllers.AppViewController
import com.mstaczek.overclicked.resources.Assets


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "OverClicked",
        icon = painterResource(Assets.AppIconPath),
        state = rememberWindowState(width = 480.dp, height = 480.dp),
    )  {
        AppViewController()
    }
}

