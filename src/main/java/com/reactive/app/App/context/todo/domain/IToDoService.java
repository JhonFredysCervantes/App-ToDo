package com.reactive.app.App.context.todo.domain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * To do service.
 */
public interface IToDoService {

    /**
     * Find all to dos by user.
     *
     * @param userId the user id
     * @return a flux of to dos
     */
    Flux<ToDo> findAllToDosByUser(String userId);

    /**
     * Create to do.
     *
     * @param toDo the to do
     */
    Mono<ToDo> create(ToDo toDo);
}
