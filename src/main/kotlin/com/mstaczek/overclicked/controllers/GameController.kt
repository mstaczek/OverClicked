package com.mstaczek.overclicked.controllers

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class GameController{
    private val MAXSCORE = 15
    private val MAXGAMES = 3
    var count by mutableStateOf(0)
    var finished by mutableStateOf(false)
    private var finishedCount by mutableStateOf(0)
    var allowRestarts by mutableStateOf(true)

    fun clicked(){
        count++
        if (count >= MAXSCORE){
            finished = true
            finishedCount++
            if(finishedCount >= MAXGAMES){
                allowRestarts = false
            }
        }
    }
    fun restart(){
        count = 0
        finished = false
    }
}
