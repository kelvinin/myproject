package com.nextcube

fun main(args: Array<String>) {
//    println("Hello, Kotlin!")
//    PrintHello_1().print();
    val pH = PrintHello();
    pH.print();
    val pH1 = PrintHello_1();
    pH1.print();
    //val pH1 = PrintHello_1();
    //pH1.print();
}

class PrintHello_1 {
    fun print() {
        println("Hello, Kotlin!");
    }
}