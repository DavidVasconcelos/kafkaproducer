package com.udemy.kafkaproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaproducerApplication

fun main(args: Array<String>) {
	runApplication<KafkaproducerApplication>(*args)
}
