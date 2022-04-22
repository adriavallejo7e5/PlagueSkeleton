package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable
import theplague.interfaces.Position

 class Player (
     override var turns: Int,
     override val livesLeft: Int,
     override val currentWeapon: Weapon,
     override val currentVehicle: Vehicle,
     override val icon : String = "🚶",
     var position: Position
        ): IPlayer, Iconizable{

        }