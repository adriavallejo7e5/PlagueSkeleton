package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable

sealed class Item: Iconizable {
    abstract var turnLeft:Int
    abstract val hasTurnsLimit:Boolean

    fun use(player: IPlayer){
        if (hasTurnsLimit){
            turnLeft--
        }
        if (turnLeft == 0){
            player.currentVehicle = OnFoot()
            turnLeft = 5
        }
    }

}