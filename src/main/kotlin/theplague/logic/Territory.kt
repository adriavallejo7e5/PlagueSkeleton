package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.ITerritory
import theplague.interfaces.Iconizable

class Territory(
    val plagueSize : Int = 0 //get()
    , override val name: IPlayer
): ITerritory {
    override fun iconList(): MutableList<Iconizable> {
        val iconList = mutableListOf<Iconizable>(
        )
        return iconList
    }
}