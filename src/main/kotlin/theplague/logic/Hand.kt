package theplague.logic


class Hand : Weapon() {
    override var turnLeft: Int = -1
    override val hasTurnsLimit: Boolean = false
    override val icon: String
        get() = "👆"
}

