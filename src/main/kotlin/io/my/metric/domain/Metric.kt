package io.my.metric.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.Instant

@Document
data class Metric(
        @Id
        val id: ObjectId,
        val name: String,
        val value: BigDecimal,
        val metricTimestamp: Instant)
