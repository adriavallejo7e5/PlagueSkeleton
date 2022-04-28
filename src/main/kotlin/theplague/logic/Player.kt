package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable
import theplague.interfaces.Position

 class Player(
     override val turns: Int,
     override val livesLeft: Int,
     override val currentWeapon: Hand,
     override val currentVehicle: OnFoot,
     override var icon: Iconizable,
     override var position: Position,
     ): IPlayer{

        }