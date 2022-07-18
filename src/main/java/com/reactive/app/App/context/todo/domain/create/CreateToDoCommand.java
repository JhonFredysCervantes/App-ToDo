package com.reactive.app.App.context.todo.domain.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Create to do command.
 */
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CreateToDoCommand {
    private String title;
    private String description;
    private boolean completed;
    private String userId;
}
