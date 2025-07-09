package devload.otel.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringApiApplication

fun main(args: Array<String>) {
    runApplication<SpringApiApplication>(*args)
}
