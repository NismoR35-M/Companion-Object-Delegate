import companionObject.Level
import delegatedProperties.DelegatedLevel
import delegatedProperties.LightBulb
import lateinit.Lamp
import lazyProperties.Circle

fun main(args: Array<String>) {

    val highestLevel = Level.highestLevel
    /*You only access Level and not the instance level1*/
    println(highestLevel)

    //Delegated object
    val delegatedLevel1 = DelegatedLevel(id = 1, boss = "Chameleon")
    val delegatedLevel2 = DelegatedLevel(id = 2, boss = "Squid")
    println(DelegatedLevel.highestLevel) //1
    delegatedLevel2.unlocked = true
    println(DelegatedLevel.highestLevel) //2

    //Limiting variable (pg 222)
    val light = LightBulb()
    light.current=50
    var current = light.current //0
    println(current)
    light.current=40
    current = light.current //40
    println(current)

    //Lazy Properties and Extension properties
    val circle = Circle(5.0) //got circle but pi has not been run yet
    val circumference = circle.circumference //pi has now a value (pg224)
    println(circumference)
    val unitCircle = Circle(1.0)


    //Lateinit
    val lamp = Lamp()
    lamp.bulb = LightBulb()
    //if you try access lateinit bulb property before its been initialized you get an exception
}