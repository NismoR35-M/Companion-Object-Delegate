package lazyProperties
/*
If you have properties that might take some time to calculate and youd don't want to slow things down until
you actually need the property ,then use 'Lazy properties'
*/

class Circle(private var radius: Double=0.0) {
    //calculate pi by myself
    val pi: Double by lazy {
        ((4.0 * Math.atan(1.0/5.0)) - Math.atan(1.0/239.0)) * 4.0
    }
    val circumference: Double
        get() = pi * radius * 2

    //Extension properties
    val Circle.diameter: Double
        get() = 2.0 * radius
}
