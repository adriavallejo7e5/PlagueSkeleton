package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable
import theplague.interfaces.Position

class Player(
    override var turns: Int,
    override var livesLeft: Int = 15,
    override var currentWeapon: Iconizable = Hand(),
) : IPlayer {

    override var position : Position = Position(0,0)

    override val icon: String
        get() = "🧍‍♂️"

    override var currentVehicle: Iconizable = OnFoot()

}