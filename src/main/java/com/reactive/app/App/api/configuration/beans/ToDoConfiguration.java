package com.reactive.app.App.api.configuration.beans;

import com.reactive.app.App.context.todo.application.find.all.FindAllToDosByUser;
import com.reactive.app.App.context.todo.create.CreateToDo;
import com.reactive.app.App.context.todo.domain.IToDoService;
import com.reactive.app.App.context.todo.domain.create.ICreateToDo;
import com.reactive.app.App.context.todo.domain.find.all.IFindAllToDosByUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * To do configuration.
 */
@Configuration
public class ToDoConfiguration {

    /**
     * Find all todos by user builder bean method.
     *
     * @param toDoService the to do service
     * @return the find all todos by user bean
     */
    @Bean
    public IFindAllToDosByUser findAllToDosByUser(IToDoService toDoService) {
        return new FindAllToDosByUser(toDoService);
    }

    /**
     * Create to do builder bean method.
     *
     * @param toDoService the to do service
     * @return the create to do bean
     */
    @Bean
    public ICreateToDo createToDo(IToDoService toDoService) {
        return new CreateToDo(toDoService);
    }
}
