package theplague.logic

import theplague.interfaces.Iconizable

abstract class Item (
    val timesLeft: Int
): Iconizable {

    fun use(){}
}