package companionObject

class LevelJava(
    val id:Int,
    var boss: String,
    var unlocked: Boolean
) {
    companion object{
        @JvmStatic var highestLevel = 1

        /*Level.getHighestLevel() Good coz of @JvmStatic
          Level.Companion.getHighestLevel() Fine too coz and necessary if @JvmStatic were not used
        */
    }
}
/*
For kotlin in jvm,you can use @JvmStatic annotation to force a property to be a static field in bytecode
with static getters and setters.hence avoid having to use the singleton name in java code
*/