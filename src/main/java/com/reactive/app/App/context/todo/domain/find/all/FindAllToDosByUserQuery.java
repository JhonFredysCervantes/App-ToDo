package com.reactive.app.App.context.todo.domain.find.all;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Find all todos by user query.
 */
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FindAllToDosByUserQuery {
    private String userId;
}
