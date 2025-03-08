package dev.digiwomb.konsistent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KonsistentApplication

fun main(args: Array<String>) {
	runApplication<KonsistentApplication>(*args)
}
