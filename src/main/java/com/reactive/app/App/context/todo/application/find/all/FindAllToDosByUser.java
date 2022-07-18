package com.reactive.app.App.context.todo.application.find.all;

import com.reactive.app.App.context.todo.domain.IToDoService;
import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.find.all.FindAllToDosByUserQuery;
import com.reactive.app.App.context.todo.domain.find.all.IFindAllToDosByUser;
import reactor.core.publisher.Flux;

/**
 * Find all todos by user.
 */
public class FindAllToDosByUser implements IFindAllToDosByUser {
    private final IToDoService toDoService;

    /**
     * Constructor
     *
     * @param toDoService the to do service
     */
    public FindAllToDosByUser(IToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public Flux<ToDo> execute(FindAllToDosByUserQuery findAllToDosByUserQuery) {
        return toDoService.findAllToDosByUser(findAllToDosByUserQuery.getUserId());
    }
}
