package com.pedro.bookswap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookswapApplication

fun main(args: Array<String>) {
    runApplication<BookswapApplication>(*args)
}
