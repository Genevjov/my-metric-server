package io.my.metric.repository

import io.my.metric.domain.Metric
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MetricRepository : MongoRepository<Metric, String> {

    fun findByName(name: String): List<Metric>
}