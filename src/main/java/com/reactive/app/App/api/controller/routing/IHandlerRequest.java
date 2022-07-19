package com.reactive.app.App.api.controller.routing;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Handler request interface.
 */
public interface IHandlerRequest {

    /**
     * Handle.
     *
     * @param request the request
     * @return the mono
     */
    Mono<ServerResponse> handle(ServerRequest request);
}
