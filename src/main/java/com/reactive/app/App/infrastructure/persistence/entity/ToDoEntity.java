package com.reactive.app.App.infrastructure.persistence.entity;

import com.reactive.app.App.context.todo.domain.ToDo;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * To do entity.
 */
@Document(collection = "todo")
@NoArgsConstructor
public class ToDoEntity extends ToDo implements Serializable {
    private static final long serialVersionUID = 7126995859374819083L;

    @Id
    @Override
    public String getId() {
        return super.getId();
    }

    /**
     * Constructor.
     *
     * @param id          the id
     * @param title       the title
     * @param description the description
     * @param completed   the is completed field
     * @param userId      the user id
     */
    public ToDoEntity(String id, String title, String description, boolean completed, String userId) {
        super(id, title, description, completed, userId);
    }

    /**
     * Method that convert a ToDo to To ToDoEntity.
     *
     * @param toDo the to do
     * @return the todo entity
     */
    public static ToDoEntity toToDoEntity(ToDo toDo) {
        return new ToDoEntity(toDo.getId(), toDo.getTitle(), toDo.getDescription(), toDo.isCompleted(), toDo.getUserId());
    }
}
