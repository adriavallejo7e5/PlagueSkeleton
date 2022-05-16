package theplague.interfaces


interface IPlayer : Iconizable{
    /**
     * Turns that the player has lived
     */
    var turns : Int

    var livesLeft: Int

    /**
     * The player current weapon
     */
    var currentWeapon : Iconizable

    /**
     * The player current vehicle
     */
    var currentVehicle : Iconizable

    var position :Position

}