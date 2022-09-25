package companionObject/*Class demonstrating COMPANION OBJECT*/

class Level(
    val id: Int,
    var boss: String,
    var unlocked: Boolean
) {
    companion object{
        var highestLevel = 1
        /*Here 'highestLevel' is a property on Level itself rather than on the instances*/
    }
}
val level1 = Level(id = 1, boss = "Chameleon", unlocked = false)
val level2 = Level(id = 2, boss = "Squid", unlocked = false)
val level3 = Level(id = 3, boss = "Chupacabra", unlocked = false)
val level4 = Level(id = 4, boss = "Yeti", unlocked = false)