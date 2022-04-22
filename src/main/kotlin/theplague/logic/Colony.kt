package theplague.logic

import theplague.interfaces.Iconizable

sealed class Colony(val size: Int, override val icon: String): Iconizable {
    fun willReproduce(): Boolean{return false}
    fun reproduce(){}
    fun needsToExpand(){}
    fun attacked(weapon: Weapon){}
    fun colonizedBy(plague: Colony): Colony?{return null}
    fun expand(position: Int, maxPosition: Int): MutableList<Colonization>{
        TODO("Not yet implemented")
    }
}