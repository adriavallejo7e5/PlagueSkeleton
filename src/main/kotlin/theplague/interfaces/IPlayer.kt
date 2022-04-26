package theplague.interfaces


interface IPlayer: Iconizable {
    /**
     * Turns that the player has lived
     */
    val turns : Int

    val livesLeft: Int

    /**
     * The player current weapon
     */
    val currentWeapon : Iconizable

    /**
     * The player current vehicle
     */
    val currentVehicle : Iconizable

    var position: Position
}