package io.my.metric.service

import io.my.metric.domain.Metric
import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class MetricExtractionService {

    fun extract(payload: String): Metric {
        val payloadParts = payload.split("/")
        if (payloadParts.size != 3) {
            throw IllegalArgumentException()
        }
        return Metric(ObjectId.get(),
                payloadParts[0],
                payloadParts[1].toBigDecimal(),
                Instant.parse(payloadParts[2]))
    }
}