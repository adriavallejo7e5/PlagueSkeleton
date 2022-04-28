package theplague.logic

import theplague.interfaces.Position

abstract class Vehicle(timesLeft: Int, val player: String) : Item(timesLeft) {
    fun canMove(from: Position, to: Position): Boolean{
        TODO()
    }
}