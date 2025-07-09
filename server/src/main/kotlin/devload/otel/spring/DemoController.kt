package devload.otel.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DemoController {

    @GetMapping("/slow")
    fun slow(): String {
        Thread.sleep(1000)
        return "done"
    }

    @GetMapping("/crash")
    fun crash(): String {
        throw RuntimeException("의도된 에러")
    }
}
