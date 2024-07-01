package com.pt.solidkotlin

//Clients should not be forced to depend on interfaces they do not use.
fun main() {
    val printer: Printer = SimplePrinter()
    printer.printDocument()

    val multiFunctionPrinter = MultiFunctionPrinter()
    multiFunctionPrinter.printDocument()
    multiFunctionPrinter.scanDocument()
}

interface Printer {
    fun printDocument()
}

interface Scanner {
    fun scanDocument()
}

class MultiFunctionPrinter : Printer, Scanner {
    override fun printDocument() {
        println("Printing document...")
    }

    override fun scanDocument() {
        println("Scanning document...")
    }
}

class SimplePrinter : Printer {
    override fun printDocument() {
        println("Printing document...")
    }
}