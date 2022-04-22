package theplague.interfaces

import theplague.logic.Vehicle
import theplague.logic.Weapon

interface IPlayer {
    /**
     * Turns that the player has lived
     */
    var turns : Int

    val livesLeft: Int

    /**
     * The player current weapon
     */
    val currentWeapon : Weapon

    /**
     * The player current vehicle
     */
    val currentVehicle : Vehicle
}