package theplague.logic


class OnFoot : Vehicle() {
    override var turnLeft: Int = -1
    override val hasTurnsLimit: Boolean = false
    override val icon: String
        get() = "🚶"
}