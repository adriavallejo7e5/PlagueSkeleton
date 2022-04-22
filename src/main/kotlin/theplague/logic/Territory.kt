package theplague.logic

import theplague.interfaces.ITerritory
import theplague.interfaces.Iconizable

class Territory(
    val plagueSize: Int = 0,


): ITerritory {
    override fun iconList(): MutableList<Iconizable> {
        TODO("Not yet implemented")
    }
}