package theplague.logic


class Ant: Colony() {
    override val icon: String
        get() = primaryIcon.repeat(size)

    override val primaryIcon: String
        get() = "🐜"

    override val memberToLoseByHand: Int
        get() = 2

    override val memberToLoseBySword: Int
        get() = 1

    override val memberToLoseByBroom: Int
        get() = this.size

    override fun willreproduce(): Boolean {
        val valorRandom : Int = (0..100).random()
        val probabilidad = 30

        return valorRandom <= probabilidad
    }
}