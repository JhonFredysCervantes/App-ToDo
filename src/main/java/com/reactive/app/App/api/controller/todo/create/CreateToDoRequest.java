package com.reactive.app.App.api.controller.todo.create;

import com.reactive.app.App.context.todo.domain.create.CreateToDoCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Create to do request.
 */
@NoArgsConstructor
@Getter
@Setter
public class CreateToDoRequest implements Serializable {
    private static final long serialVersionUID = -5654920511491945807L;

    private String title;
    private String description;
    private boolean completed;
    private String userId;

    /**
     * Create to do request to create to do command.
     *
     * @return a CreateToDoCommand
     */
    public CreateToDoCommand CreateToDoRequestToCreateToDoCommand() {
        return CreateToDoCommand.builder()
                .title(title)
                .description(description)
                .completed(completed)
                .userId(userId)
                .build();
    }
}
