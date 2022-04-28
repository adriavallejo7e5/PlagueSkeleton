package theplague.ui.console

import theplague.interfaces.Position
import theplague.logic.*
import java.util.*

fun main() {
    val width = 8
    val height = 8

    val player = Player(0, 15, Hand(), OnFoot(), "🚶", Position(
        3, 4
    ))

    val territories : MutableList<List<Territory>> = MutableList<List<Territory>>(height){
        List<Territory>(width){
            Territory()
        }
    }

    val world = World(width, height, player, territories)
    val scanner = Scanner(System.`in`)
    val worldUi = WorldUi(scanner, world)
    worldUi.play()
}