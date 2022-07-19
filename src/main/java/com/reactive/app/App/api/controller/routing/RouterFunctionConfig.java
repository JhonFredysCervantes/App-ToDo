package com.reactive.app.App.api.controller.routing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static com.reactive.app.App.api.controller.routing.HandlerFactoryMethod.createHandlerRequest;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * Router function config.
 */
@Configuration
public class RouterFunctionConfig {
    private final HandlerFactoryMethod handlerFactoryMethod;

    /**
     * Constructor
     *
     * @param handlerFactoryMethod the handler factory method
     */
    public RouterFunctionConfig(HandlerFactoryMethod handlerFactoryMethod) {
        this.handlerFactoryMethod = handlerFactoryMethod;
    }

    /**
     * Method that registry router function bean.
     *
     * @return a RouterFunction
     */
    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/api/v2/todos"), request -> createHandlerRequest("findAllToDosByUser").handle(request))
                .andRoute(POST("/api/v2/todos"), request -> createHandlerRequest("createToDo").handle(request));
    }
}
