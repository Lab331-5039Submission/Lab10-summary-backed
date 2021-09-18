package se331.lab.summary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SummaryApplication

fun main(args: Array<String>) {
	runApplication<SummaryApplication>(*args)
}
