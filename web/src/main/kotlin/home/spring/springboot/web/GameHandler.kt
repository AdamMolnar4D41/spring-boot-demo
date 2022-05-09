package home.spring.springboot.web

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class GameHandler {

    fun handle(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok()
            .body(BodyInserters.fromProducer(createDummyString(), String::class.java))
    }

    private fun createDummyString() = Mono.just("some dummy data")
}