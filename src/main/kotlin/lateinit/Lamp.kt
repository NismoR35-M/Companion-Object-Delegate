package lateinit

import delegatedProperties.LightBulb

//If you just want to denote that a property will not have a value when the class instance is created then use lateinit keyword
class Lamp {
    lateinit var bulb: LightBulb
    /*
    since the property has no value when the class instance is initialized and property will change
    at some later time, you must use var with lateinit and not val
    */
}