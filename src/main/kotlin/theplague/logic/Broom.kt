package theplague.logic

class Broom: Weapon() {
    override var turnLeft: Int = 5
    override val hasTurnsLimit: Boolean = false

    override val icon: String
        get() = "🧹"
}