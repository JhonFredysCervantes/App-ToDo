package com.reactive.app.App.api.controller.todo.find.all;

import com.reactive.app.App.api.controller.routing.IHandlerRequest;
import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.find.all.FindAllToDosByUserQuery;
import com.reactive.app.App.context.todo.domain.find.all.IFindAllToDosByUser;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Find all todos by user handler request.
 */
@Component
public class FindAllToDoHandlerRequest implements IHandlerRequest {
    private final IFindAllToDosByUser findAllToDosByUser;

    /**
     * Constructor
     *
     * @param findAllToDosByUser the find all todos by user
     */
    public FindAllToDoHandlerRequest(IFindAllToDosByUser findAllToDosByUser) {
        this.findAllToDosByUser = findAllToDosByUser;
    }

    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        var userid = request.queryParam("userId").orElseThrow(() -> new IllegalArgumentException("userId is required"));
        return ServerResponse.ok()
                .body(findAllToDosByUser.execute(new FindAllToDosByUserQuery(userid)), ToDo.class);
    }
}
