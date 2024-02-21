package com.guiodes.customannotationspoc

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

val logger = KotlinLogging.logger {  }

@SpringBootApplication
class CustomAnnotationsPocApplication(
    gateway: Gateway
) {
    init {
        gateway.execute()
        gateway.execute2()
        gateway.execute3()
    }
}

fun main(args: Array<String>) {
    runApplication<CustomAnnotationsPocApplication>(*args)
}
