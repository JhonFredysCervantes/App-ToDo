package com.reactive.app.App.api.controller.todo.create;

import com.reactive.app.App.api.controller.routing.IHandlerRequest;
import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.create.ICreateToDo;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Create to do handler request.
 */
@Component
public class CreateToDoHandlerRequest implements IHandlerRequest {
    private final ICreateToDo createToDo;

    /**
     * Constructor
     *
     * @param createToDo the create to do
     */
    public CreateToDoHandlerRequest(ICreateToDo createToDo) {
        this.createToDo = createToDo;
    }

    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        var bodyRequest = request.bodyToMono(CreateToDoRequest.class);

        return bodyRequest.flatMap(createToDoRequest1 ->
                ServerResponse.ok()
                        .body(createToDo.execute(createToDoRequest1.CreateToDoRequestToCreateToDoCommand()), ToDo.class));
    }
}
