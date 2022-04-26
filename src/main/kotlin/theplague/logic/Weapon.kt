package theplague.logic

import theplague.interfaces.Iconizable

open class Weapon(timesLeft: Int, val player: Player) : Item(timesLeft) {
    constructor(player: Player) : this(player)
}