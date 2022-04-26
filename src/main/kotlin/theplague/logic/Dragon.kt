package theplague.logic

import theplague.interfaces.Iconizable

class Dragon(
    val timeToReproduce: Int, size: Int, icon: Iconizable
): Colony(size, icon) {
}