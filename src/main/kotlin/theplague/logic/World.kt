package theplague.logic

import theplague.interfaces.*
import java.util.Scanner
import kotlin.math.abs
import kotlin.math.max


data class DefaultIcon(override val icon: String) : Iconizable

class World(
    override val height: Int,
    override val width: Int,
    override val territories: List<List<ITerritory>>,
    override val player: IPlayer
): IWorld {

    override fun randomPosition(): Position {
        val randomX = (0..7).random()
        val randomY = (0..7).random()
        return Position(randomX, randomY)
    }
    override fun nextTurn() {
        if (player.currentWeapon.icon != "👆"){
            println("next turn started")
            generateNewColonies()
            generateNewItems()
            reproduceAndExpand()
            player.turns++
        }

        when(player.currentVehicle){
            is Bicycle ->{
                (player.currentVehicle as Bicycle).use(player)
            }
            is Helicopter ->{
                (player.currentVehicle as Helicopter).use(player)
            }
        }
    }

    override fun generateNewItems() {
        val x = randomPosition().x
        val y = randomPosition().y
        val bicycle = Bicycle()
        val helicopter = Helicopter()
        val broom = Broom()
        val sword = Sword()
        if (territories[x][y].icons == List<Iconizable>(0){DefaultIcon(" ")}.toMutableList()){
            when((1..100).random()){
                in 1..25 ->{
                    territories[x][y].addIcon(bicycle)
                }
                in 26..35 ->{
                    territories[x][y].addIcon(helicopter)
                }
                in 36..60 ->{
                    territories[x][y].addIcon(broom)
                }
                in 61..70 ->{
                    territories[x][y].addIcon(sword)
                }
            }
        }
        println("New items")
    }

    private val listColonization = mutableListOf<Colonization>()

    override fun generateNewColonies() {
        val x = randomPosition().x
        val y = randomPosition().y
        val ant = Ant()
        val dragon = Dragon()
        if (territories[x][y].icons == List<Iconizable>(0){DefaultIcon(" ")}.toMutableList()){
            when((1..100).random()){
                in 1..30 ->{
                    territories[x][y].addIcon(ant)
                    listColonization.add(Colonization(ant, Position(x, y)))
                }
                in 31..40 ->{
                    territories[x][y].addIcon(dragon)
                    listColonization.add(Colonization(dragon, Position(x, y)))
                }
            }
        }
        println("New colonies")
    }


    override fun reproduceAndExpand(){
        listColonization.forEach {
            if (it.colony.needsToExpand()){
                it.colony.expand(it.position, 1)
                player.livesLeft--
            }else{
                it.colony.reproduce()
            }
        }

        println("Reproduce and expand")
    }



    override fun gameFinished(): Boolean {
        println("game finish checked")
        return player.livesLeft <= 0
    }

    override fun canMoveTo(position: Position): Boolean {
        println("can move checked")
        var canMove = false

        val deltaMoveY = abs(position.y - player.position.y)
        val deltaMoveX = abs(position.x - player.position.x)
        val dist = max(deltaMoveY, deltaMoveX)

        when(player.currentVehicle){
            is OnFoot ->{
                canMove = dist < 2
            }
            is Bicycle ->{
                canMove = dist < 5
            }
            is Helicopter ->{
                canMove = true
            }
        }
        return canMove
    }

    override fun moveTo(position: Position) {

        println("player move")

        val lastTerr : ITerritory = territories[player.position.y][player.position.x]
        val targetTerr : ITerritory = territories[position.y][position.x]

        lastTerr.removeIcon(player)
        targetTerr.addIcon(player)

        player.position = position

    }


    override fun exterminate() {
        println("exterminate")
        val cell = territories[player.position.y][player.position.x]

        cell.icons.forEach{
            if (it is Colony){
                it.attacked(player.currentWeapon as Weapon)
            }
        }
    }

    override fun takeableItem(): Iconizable? {
        println("takeableItem")

        val cell = territories[player.position.y][player.position.x]

        cell.icons.forEach {
            if(it is Item){
                return it
            }
        }
        return null
    }

    override fun takeItem(item : Item) {
        println("item taken")
        if(item is Vehicle){
            player.currentVehicle = item

        }else if (item is Weapon) {
            player.currentWeapon = item

        }
        val cell = territories[player.position.y][player.position.x]
        cell.removeIcon(item)
    }

}