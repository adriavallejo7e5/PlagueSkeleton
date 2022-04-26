package theplague.logic

import theplague.interfaces.Position

open class Vehicle(timesLeft: Int, val player: Player) : Item(timesLeft) {
    fun canMove(from: Position, to: Position): Boolean{
        TODO()
    }
}