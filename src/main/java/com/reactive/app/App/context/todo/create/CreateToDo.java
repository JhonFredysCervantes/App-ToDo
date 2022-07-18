package com.reactive.app.App.context.todo.create;

import com.reactive.app.App.context.todo.domain.IToDoService;
import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.create.CreateToDoCommand;
import com.reactive.app.App.context.todo.domain.create.ICreateToDo;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * Create to do.
 */
public class CreateToDo implements ICreateToDo {
    private final IToDoService toDoService;

    /**
     * Constructor.
     *
     * @param toDoService To do service.
     */
    public CreateToDo(IToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @Override
    public Mono<ToDo> execute(CreateToDoCommand createToDoCommand) {
        var todo = ToDo.builder()
                .id(UUID.randomUUID().toString())
                .title(createToDoCommand.getTitle())
                .description(createToDoCommand.getDescription())
                .completed(createToDoCommand.isCompleted())
                .userId(createToDoCommand.getUserId())
                .build();

        return toDoService.create(todo);
    }
}
