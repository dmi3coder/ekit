package io.github.dmitrychaban.ekit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EkitApplication

fun main(args: Array<String>) {
    runApplication<EkitApplication>(*args)
}
