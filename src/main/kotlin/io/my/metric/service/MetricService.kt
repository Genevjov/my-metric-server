package io.my.metric.service

import io.my.metric.domain.Metric
import io.my.metric.repository.MetricRepository
import org.springframework.stereotype.Service


@Service
class MetricService(private val metricRepository: MetricRepository) {

    fun save(metric: Metric) {
        metricRepository.save(metric)
    }

    fun findByName(name: String): List<Metric> {
        return metricRepository.findByName(name)
    }
}