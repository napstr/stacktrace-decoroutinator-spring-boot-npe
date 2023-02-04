package com.example.demo

import dev.reformator.stacktracedecoroutinator.runtime.DecoroutinatorRuntime
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	DecoroutinatorRuntime.load()
	runApplication<DemoApplication>(*args)
}
