package com.reactive.app.App.context.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ToDo
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ToDo {
    private String id;
    private String title;
    private String description;
    private boolean completed;
    private String userId;
}
