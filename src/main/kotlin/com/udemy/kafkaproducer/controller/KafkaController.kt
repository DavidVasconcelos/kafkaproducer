package com.udemy.kafkaproducer.controller

import com.udemy.kafkaproducer.model.SimpleModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kafka")
class KafkaController(@Autowired val kafkaTemplate: KafkaTemplate<String, SimpleModel>) {

    @PostMapping
    fun post(@RequestBody simpleModel: SimpleModel) {
        kafkaTemplate.send("myTopic", simpleModel)

    }
}