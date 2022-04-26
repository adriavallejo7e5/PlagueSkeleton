package theplague.interfaces

interface ITerritory {
    val name: IPlayer
    /**
     * List of icons of the current territory (4 max)
     */
    fun iconList() : MutableList<Iconizable>
}