// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle) :Boolean{
    val(a,b,c)= triangle
    if(a<b+c && b<a+c && c<b+a){return true}
    return false
}
// Add isValidTriangle() and triangleArea() functions here
fun triangleArea(triangle: Triangle) : Double{
    val(a,b,c) = triangle

    val s = (a + b + c)/2
    var area = s*(s-a)*(s-b)*(s-c)
    area = sqrt(area)
    return area
}