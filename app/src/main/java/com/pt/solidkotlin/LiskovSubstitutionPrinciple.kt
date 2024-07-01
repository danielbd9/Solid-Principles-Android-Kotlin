package com.pt.solidkotlin

//Objects of a superclass should be replaceable with objects of a subclass without affecting the functionality.
fun main() {
    val bird: Bird = Sparrow()
    bird.fly() // Works fine

    val ostrich: Bird = Ostrich()
    ostrich.fly() // Throws an exception, violating LSP
}

open class Bird {
    open fun fly() {
        println("Bird is flying")
    }
}

class Sparrow : Bird() {
    override fun fly() {
        println("Sparrow is flying")
    }
}

class Ostrich : Bird() {
    override fun fly() {
        //throw UnsupportedOperationException("Ostriches can't fly")
        println("Ostriches can't fly")
    }
}