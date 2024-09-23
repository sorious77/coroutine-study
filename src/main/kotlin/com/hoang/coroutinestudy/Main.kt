package com.hoang.coroutinestudy

import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("START")

    println("END")
}

fun newRoutine() {
    val num1 = 1
    val num2 = 2

    println("${num1 + num2}")
}