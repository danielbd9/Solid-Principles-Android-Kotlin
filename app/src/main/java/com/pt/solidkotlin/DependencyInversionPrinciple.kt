package com.pt.solidkotlin


//High-level modules should not depend on low-level modules. Both should depend on abstractions.
fun main() {
    val keyboard: Keyboard = StandardKeyboard()
    val monitor: Monitor = HDMonitor()
    val computer = Computer(keyboard, monitor)
    computer.useComputer()
}

interface Keyboard {
    fun type(): String
}

interface Monitor {
    fun display(): String
}

class StandardKeyboard : Keyboard {
    override fun type(): String {
        return "Typing on a standard keyboard"
    }
}

class HDMonitor : Monitor {
    override fun display(): String {
        return "Displaying on an HD monitor"
    }
}

class Computer(private val keyboard: Keyboard, private val monitor: Monitor) {
    fun useComputer() {
        println(keyboard.type())
        println(monitor.display())
    }
}