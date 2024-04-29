package com.kotlin.api.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApiApplication

fun main(args: Array<String>) {
	runApplication<FirstKotlinApiApplication>(*args)
}
