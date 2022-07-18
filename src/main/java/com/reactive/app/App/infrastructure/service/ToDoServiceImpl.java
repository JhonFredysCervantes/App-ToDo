package com.reactive.app.App.infrastructure.service;

import com.reactive.app.App.context.todo.domain.IToDoService;
import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.infrastructure.persistence.entity.ToDoEntity;
import com.reactive.app.App.infrastructure.persistence.repository.IToDoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * To do service implementation.
 */
@Service
@Slf4j
public class ToDoServiceImpl implements IToDoService {
    private final IToDoRepository toDoRepository;

    /**
     * Constructor.
     *
     * @param toDoRepository To do repository.
     */
    public ToDoServiceImpl(IToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public Flux<ToDo> findAllToDosByUser(String userId) {
        log.info("Find all todos by user: {}", userId);
        return toDoRepository.findToDoEntitiesByUserId(userId)
                .map(ToDo.class::cast);
    }

    @Override
    public Mono<ToDo> create(ToDo toDo) {
        log.info("Create todo: {}", toDo.getId());
        return toDoRepository.save(ToDoEntity.toToDoEntity(toDo))
                .cast(ToDo.class);
    }
}
