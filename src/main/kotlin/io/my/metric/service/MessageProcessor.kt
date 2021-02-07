package io.my.metric.service

import io.my.metric.util.logger
import org.springframework.messaging.Message
import org.springframework.stereotype.Service

@Service
class MessageProcessor(var metricService: MetricService,
                       var metricExtractionService: MetricExtractionService) {

    val logger = logger<MessageProcessor>()

    fun handleMessage(message: Message<ByteArray>) {
        val payload = String(message.payload)
        logger.info("Received message -- payload: {}", payload)
        val metric = metricExtractionService.extract(payload)
        metricService.save(metric)
    }
}
