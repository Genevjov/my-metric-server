package io.my.metric.rest

import io.my.metric.domain.Metric
import io.my.metric.service.MetricService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/metric")
@RestController
class MetricRest(val metricService: MetricService) {


    @CrossOrigin
    @RequestMapping("GET", "name/{name}")
    fun byName(@PathVariable name: String): ResponseEntity<List<Metric>> {
        val metrics = metricService.findByName(name)
        return ResponseEntity.ok(metrics)
    }
}