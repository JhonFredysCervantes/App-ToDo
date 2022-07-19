package com.reactive.app.App.api.controller.todo.create;

import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.create.ICreateToDo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Create to do controller.
 */
@RestController
public class CreateToDoController {

    private final ICreateToDo createToDo;

    /**
     * Constructor
     *
     * @param createToDo the create to do
     */
    public CreateToDoController(ICreateToDo createToDo) {
        this.createToDo = createToDo;
    }

    /**
     * Create to do method
     *
     * @param createToDoRequest the create to do request
     * @return the response entity
     */
    @PostMapping(value = "/api/todos")
    public ResponseEntity<Mono<ToDo>> createToDo(@RequestBody CreateToDoRequest createToDoRequest) {
        return ResponseEntity.ok()
                .body(createToDo.execute(createToDoRequest.CreateToDoRequestToCreateToDoCommand()));
    }
}
