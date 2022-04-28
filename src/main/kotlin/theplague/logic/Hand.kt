package theplague.logic

import theplague.interfaces.Iconizable

class Hand() : Weapon(4) {
    override val icon: Iconizable
        get() = ""

//metodo correcto
}

