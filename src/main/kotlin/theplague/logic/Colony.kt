package theplague.logic

import theplague.interfaces.Iconizable
import theplague.interfaces.Position

sealed class Colony: Iconizable {
    var size: Int = 1
    abstract val primaryIcon: String
    abstract val memberToLoseByHand: Int
    abstract val memberToLoseBySword: Int
    abstract val memberToLoseByBroom: Int

    abstract fun willreproduce(): Boolean

    fun reproduce() {
        if (this.willreproduce()){
            size++
        }
    }

    fun needsToExpand(): Boolean {
        return size == 4
    }

    fun attacked(weapon: Weapon) {
        when (weapon) {
            is Hand -> {
                size -= memberToLoseByHand
            }
            is Sword -> {
                size -= memberToLoseBySword
            }
            is Broom -> {
                size -= memberToLoseByBroom
            }
        }

        if (size <= 0) {
            val territory = Territory()
            territory.removeIcon(this)
        }
    }

    val sonType = this

    fun expand(position: Position, radius: Int): Colonization {
        var offsetX : Int
        var offsetY : Int

        do {
            offsetX = (-radius..radius).random()
            offsetY = (-radius..radius).random()
        } while (offsetX == 0 && offsetY == 0)

        var newPosition = Position(position.x + offsetX, position.y + offsetY)

        if (sonType is Ant && positionNotValid(position, newPosition)) {
            newPosition = Position(position.x, position.y)
        }

        return Colonization(sonType, newPosition)
    }


    fun positionNotValid(position: Position, newPosition: Position): Boolean{
        var positionValid = true
        val colonizationA = Colonization(sonType, position)
        val colonizationD = Colonization(Dragon(), newPosition)

        if (colonizationA.position == colonizationD.position){
            positionValid = false
        }

        return positionValid
    }
}