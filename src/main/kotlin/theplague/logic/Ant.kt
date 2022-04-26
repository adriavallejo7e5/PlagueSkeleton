package theplague.logic

import theplague.interfaces.Iconizable

class Ant(
    val reproductionTax: Double,
    size: Int, icon: Iconizable
): Colony(size, icon) {
}