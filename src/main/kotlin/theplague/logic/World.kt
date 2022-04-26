package theplague.logic

import theplague.interfaces.*
import theplague.ui.console.WorldUi
import kotlin.math.abs
import kotlin.math.max
import kotlin.random.Random


class World(
    override val width: Int,
    override val height: Int,
    override val player: Player,
    override val territories: MutableList<List<Territory>>
): IWorld {
    override fun nextTurn() {

        /*
        Assegura't de que et funciona tot abans d'implementar cada una de les fases
        - Generar noves colònies
        - Generar nous ítems
        - Reproducció
        - Expansió
         */
    }

    override fun gameFinished(): Boolean {
        TODO("Not yet implemented")

    }

    override fun canMoveTo(position: Position): Boolean {
        val dist = max(abs(position.y - player.position.y) , abs(position.x - player.position.x))
        return dist < 3
    }

    override fun moveTo(position: Position) {
        val lastTerr : ITerritory = territories[player.position.y][player.position.x]
        val targetTerr : ITerritory = territories[position.y][position.x]

        lastTerr.iconList().remove(player.currentVehicle)
        targetTerr.iconList().remove(player.currentVehicle)

        player.position = Position(position.x, position.y)
    }

    override fun exterminate() {
        //TODO
        println("Exterminate")
    }

    override fun takeableItem(): Iconizable? {
        TODO("Not yet implemented")
//        when(){
//
//        }
    }

    override fun takeItem() {
        TODO("Not yet implemented")
    }

    fun randomPosition(): Position{
        val x = (0..7).random()
        val y = (0..7).random()
        return Position(x, y)
    }

    fun generateNewColonies(num: Int){
        when(num){
            30 ->
        }
    }
    fun place(){}
    fun generateNewItems(){}
    fun reproduce(){}
    fun expand(){}
}