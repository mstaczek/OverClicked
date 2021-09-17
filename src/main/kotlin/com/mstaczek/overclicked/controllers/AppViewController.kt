package com.mstaczek.overclicked.controllers

import MainMenuUI
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.mstaczek.overclicked.ui.MainGameUI
import com.mstaczek.overclicked.resources.MyCustomTheme
import kotlin.system.exitProcess

private class ViewManagerClass{
    enum class ViewState{
        MAINMENU, GAME
    }
    var currentScreenState = mutableStateOf(ViewState.MAINMENU)

    fun goToMenuUI(){
        currentScreenState.value = ViewState.MAINMENU
    }
    fun goToGameUI(){
        currentScreenState.value = ViewState.GAME
    }
    fun closeWindow(){
        exitProcess(0)
    }
}

@Composable
fun AppViewController() {
    val viewManager = remember { ViewManagerClass() }

    MyCustomTheme {
        when (viewManager.currentScreenState.value) {
            ViewManagerClass.ViewState.MAINMENU ->
                MainMenuUI(
                    startGame = {viewManager.goToGameUI()},
                    exitApp = {viewManager.closeWindow()}
                )
            ViewManagerClass.ViewState.GAME ->
                MainGameUI(
                    returnToMenu = {viewManager.goToMenuUI()}
                )
        }
    }
}