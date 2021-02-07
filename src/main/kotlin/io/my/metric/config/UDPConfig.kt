package io.my.metric.config

import io.my.metric.service.MessageProcessor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.dsl.IntegrationFlow
import org.springframework.integration.dsl.IntegrationFlows
import org.springframework.integration.ip.udp.UnicastReceivingChannelAdapter

@Configuration
class UDPConfig(private val messageProcessor: MessageProcessor) {

    @Bean
    fun processUniCastUdpMessage(): IntegrationFlow {
        return IntegrationFlows
                .from(UnicastReceivingChannelAdapter(11111))
                .handle(messageProcessor::handleMessage)
                .get()
    }
}