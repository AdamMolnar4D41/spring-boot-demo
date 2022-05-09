package home.spring.springboot.web

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class GameRouter(private val gameHandler: GameHandler) {

    @Bean
    fun routeGameRequests(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.GET("/games"), gameHandler::handle)
    }
}