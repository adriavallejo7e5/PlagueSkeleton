package theplague.logic

import theplague.interfaces.Position

open class Vehicle(timesLeft: Int, val icon: String) : Item(timesLeft) {
    fun canMove(from: Position, to: Position): Boolean{
        TODO()
    }
}