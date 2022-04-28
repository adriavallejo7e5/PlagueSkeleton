package theplague.interfaces

import theplague.logic.Hand
import theplague.logic.OnFoot


interface IPlayer: Iconizable {
    /**
     * Turns that the player has lived
     */
    val turns : Int

    val livesLeft: Int

    /**
     * The player current weapon
     */
    val currentWeapon : Hand

    /**
     * The player current vehicle
     */
    val currentVehicle : OnFoot

    var position: Position
}