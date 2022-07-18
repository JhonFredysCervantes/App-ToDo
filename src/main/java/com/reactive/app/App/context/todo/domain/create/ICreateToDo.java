package com.reactive.app.App.context.todo.domain.create;

import com.reactive.app.App.context.todo.domain.ToDo;
import reactor.core.publisher.Mono;

/**
 * Create to do command.
 */
public interface ICreateToDo {

    /**
     * Execute method.
     *
     * @param createToDoCommand the create to do command
     */
    Mono<ToDo> execute(CreateToDoCommand createToDoCommand);
}
