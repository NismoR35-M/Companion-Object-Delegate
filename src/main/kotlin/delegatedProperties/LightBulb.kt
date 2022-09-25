package delegatedProperties

import kotlin.properties.Delegates

//Demonstrating LIMITING VARIABLE
class LightBulb {
    companion object{
        const val maxCurrent = 40
    }
    var current by Delegates.vetoable(0){
        _,_,new ->
        if (new > maxCurrent){
            println(
                "Current too high, falling back to previous setting."
            );false
        }else{
            true
        }
    }
}
/*
using by Delegates.vetoable() and passing an initial value.The lambda callback passed to vetoable() return boolean indicating
whether the value should be allowed to be changed.If the current flowing into the bulb exceeds the
maximum value,it will revert to its last successful value.
*/