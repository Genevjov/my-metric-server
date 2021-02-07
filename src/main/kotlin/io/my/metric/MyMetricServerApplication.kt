package io.my.metric

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMetricServerApplication

fun main(args: Array<String>) {
    runApplication<MyMetricServerApplication>(*args)
}
