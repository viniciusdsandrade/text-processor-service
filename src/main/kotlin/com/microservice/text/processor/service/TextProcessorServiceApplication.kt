package com.microservice.text.processor.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TextProcessorServiceApplication

fun main(args: Array<String>) {
	runApplication<TextProcessorServiceApplication>(*args)
}
