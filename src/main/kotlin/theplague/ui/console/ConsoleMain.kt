package theplague.ui.console

import theplague.logic.*
import java.util.*

fun main() {

    val width = 8;
    val height = 8;

    val territories: List<List<Territory>> = List<List<Territory>>(height){
        List<Territory>(width){
            Territory()
        }
    }

    territories[3][4].addIcon(Bicycle())
    territories[6][5].addIcon(Ant())
    territories[0][3].addIcon(Sword())

    val player = Player(0, 15)
    territories[player.position.y][player.position.x].icons.add(player)

    val world = World(width,height,territories, player)
    val scanner = Scanner(System.`in`)
    val worldUi = WorldUi(scanner, world)
    worldUi.play()
}