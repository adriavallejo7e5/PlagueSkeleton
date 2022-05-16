package theplague.interfaces

import theplague.logic.Item
import theplague.logic.Player
import theplague.logic.Territory
import java.util.*

interface IWorld{
    val width: Int
    val height: Int

    /**
     * Matrix of ITerritories
     */
    val territories : List<List<ITerritory>>

    val player : IPlayer


    fun randomPosition(): Position

    /**
     * generate the new colonies and items, reproduces the colonies and expands them
     */
    fun nextTurn()


    fun generateNewItems()
    fun generateNewColonies()


    /**
     * Returns true if the game has finished
     */
    fun gameFinished(): Boolean

    fun reproduceAndExpand() {

    }

    /**
     * Returns true if the player can move to the given position using the current vehicle
     */
    fun canMoveTo(position: Position) : Boolean

    /**
     * Moves the player to the new position
     */
    fun moveTo(position: Position)
    /**
     * The player exterminates the plague
     */
    fun exterminate()

    /**
     * Returns the item than the player can take if any
     */
    fun takeableItem(): Iconizable?

    /**
     * The player takes the item
     */
    fun takeItem(item : Item)
}