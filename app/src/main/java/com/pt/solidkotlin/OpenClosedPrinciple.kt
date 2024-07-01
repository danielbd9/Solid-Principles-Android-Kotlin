package com.pt.solidkotlin

//Software entities should be open for extension but closed for modification.
fun main() {
    val shapes: List<Shape> = listOf(Circle(5.0), Rectangle(4.0, 6.0))
    shapes.forEach { shape -> println("Area: ${shape.area()}") }
}

// A base class for shape
open class Shape {
    open fun area(): Double = 0.0
}

// Extending the base class without modifying it
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override fun area(): Double = length * width
}