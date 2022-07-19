package com.reactive.app.App.api.controller.todo.find.all;

import com.reactive.app.App.context.todo.domain.ToDo;
import com.reactive.app.App.context.todo.domain.find.all.FindAllToDosByUserQuery;
import com.reactive.app.App.context.todo.domain.find.all.IFindAllToDosByUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Find all todos by user controller.
 */
@RestController
public class FindAllToDosByUserController {
    private final IFindAllToDosByUser findAllToDosByUser;


    /**
     * Constructor
     *
     * @param findAllToDosByUser the find all todos by user
     */
    public FindAllToDosByUserController(IFindAllToDosByUser findAllToDosByUser) {
        this.findAllToDosByUser = findAllToDosByUser;
    }

    /**
     * Find all todos by user.
     *
     * @param userId the user id
     * @return the string
     */
    @GetMapping(value = "/api/todos")
    Flux<ToDo> findAllToDosByUser(@RequestParam("userId") String userId) {
        return findAllToDosByUser.execute(new FindAllToDosByUserQuery(userId));
    }
}
