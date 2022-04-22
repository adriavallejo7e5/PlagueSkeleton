package theplague.logic

import theplague.interfaces.*
import kotlin.random.Random


class World(
    override val width: Int,
    override val height: Int,
    override val player: Player,
    override val territories: MutableList<List<Territory>>
): IWorld {
    override fun nextTurn() {
        TODO("Not yet implemented")
        /*
        Assegura't de que et funciona tot abans d'implementar cada una de les fases
        - Generar noves colònie
        - Generar nous ítems
        - Reproducció
        - Expansió
         */
    }

    override fun gameFinished(): Boolean {
        TODO("Not yet implemented")
    }

    override fun canMoveTo(position: Position): Boolean {
        TODO("Not yet implemented")
    }

    override fun moveTo(position: Position) {
//        val lastTerr =
//        val lastTerr =
    }

    override fun exterminate() {
        TODO("Not yet implemented")
    }

    override fun takeableItem(): Iconizable? {
        TODO("Not yet implemented")
    }

    override fun takeItem() {
        TODO("Not yet implemented")
    }

    fun randomPosition(): Position{
        val x = (0..7).random()
        val y = (0..7).random()
        return Position(x, y)
    }

    fun generateNewColonies(){

    }
    fun place(){}
    fun generateNewItems(){}
    fun reproduce(){}
    fun expand(){}
}