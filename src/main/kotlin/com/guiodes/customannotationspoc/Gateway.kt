package com.guiodes.customannotationspoc

import com.guiodes.customannotationspoc.annotation.LogResult
import org.springframework.stereotype.Component

@Component
class Gateway {

    @LogResult
    fun execute(): String {
        return "Hello, World!"
    }

    @LogResult
    fun execute2(): Pair<String, String> {
        return Pair("Hello", "World")
    }

    @LogResult
    fun execute3(): Map<String, String> {
        return mapOf("Hello" to "World")
    }
}