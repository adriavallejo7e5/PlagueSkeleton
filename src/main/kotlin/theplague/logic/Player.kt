package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable
import theplague.interfaces.Position

 class Player (
     override val turns: Int,
     override val livesLeft: Int,
     override val currentWeapon: Iconizable,
     override val currentVehicle: Iconizable,
     val icon : Iconizable,
     override var position: Position,
     ): IPlayer{

        }