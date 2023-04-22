package com.example.swaggateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SwagGatewayApplication

fun main(args: Array<String>) {
	runApplication<SwagGatewayApplication>(*args)
}
