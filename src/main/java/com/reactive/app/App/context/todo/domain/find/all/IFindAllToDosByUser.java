package com.reactive.app.App.context.todo.domain.find.all;

import com.reactive.app.App.context.todo.domain.ToDo;
import reactor.core.publisher.Flux;

/**
 * Find all todos by user interface.
 */
public interface IFindAllToDosByUser {

    /**
     * Execute find all todos by user method.
     *
     * @param findAllToDosByUserQuery then find all todos by user query.
     * @return a flux of todos.
     */
    Flux<ToDo> execute(FindAllToDosByUserQuery findAllToDosByUserQuery);

}
