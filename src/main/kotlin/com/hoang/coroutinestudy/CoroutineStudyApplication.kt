package com.hoang.coroutinestudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutineStudyApplication

fun main(args: Array<String>) {
    runApplication<CoroutineStudyApplication>(*args)
}
