package delegatedProperties

import kotlin.properties.Delegates

/*using 'observable' to provide a callback for when property changes
*/
class DelegatedLevel(
    val id:Int,
    var boss: String
) {
    companion object{
        var highestLevel = 1
    }
    var unlocked: Boolean by Delegates.observable(false){ /* You specify the property observer using
                                                                    by Delegates.observable() whose first parameter is the
                                                                    initial value of the property
                                                                    */
        _, old, new ->
        if (new && id > highestLevel){
            highestLevel = id
        }
        println("$old -> $new")
    }
}
/*
When the player unlocks new level, it will update the highestLevel of DelegatedLevel if the level is new high
*/