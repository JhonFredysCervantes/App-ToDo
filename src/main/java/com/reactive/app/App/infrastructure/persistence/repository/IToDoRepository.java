package com.reactive.app.App.infrastructure.persistence.repository;

import com.reactive.app.App.infrastructure.persistence.entity.ToDoEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * To do repository interface.
 */
@Repository
public interface IToDoRepository extends ReactiveMongoRepository<ToDoEntity, String> {

    /**
     * Find all todos by user id.
     *
     * @param userId the user id
     * @return a flux of todos
     */
    Flux<ToDoEntity> findToDoEntitiesByUserId(String userId);
}
