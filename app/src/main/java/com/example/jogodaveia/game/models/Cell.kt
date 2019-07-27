package com.example.jogodaveia.game.models

data class Cell(var player: Player) {
    val isEmpty: Boolean
        get() = player.value.isEmpty()
}