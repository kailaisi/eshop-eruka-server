package com.kailaisi.eruka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ErukaApplication

fun main(args: Array<String>) {
    runApplication<ErukaApplication>(*args)
}
