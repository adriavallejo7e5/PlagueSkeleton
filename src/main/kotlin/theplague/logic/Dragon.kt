package theplague.logic


class Dragon: Colony() {
    override val icon: String
        get() = primaryIcon.repeat(size)

    override val primaryIcon: String
        get() = "🐉"

    override val memberToLoseByHand: Int
        get() = 0

    override val memberToLoseBySword: Int
        get() = 1

    override val memberToLoseByBroom: Int
        get() = 0

    var turns : Int = 0

    override fun willreproduce(): Boolean {
        var factor = false
        if (turns % 5 == 0 ){
            factor = true
        }
        return factor
    }
}