package com.reactive.app.App.api.controller.routing;

import com.reactive.app.App.api.controller.todo.create.CreateToDoHandlerRequest;
import com.reactive.app.App.api.controller.todo.find.all.FindAllToDoHandlerRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Handler factory method.
 */
@Component
public class HandlerFactoryMethod {
    private static ApplicationContext applicationContext;

    /**
     * Constructor
     *
     * @param applicationContext the application context
     */
    private HandlerFactoryMethod(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static IHandlerRequest createHandlerRequest(String handlerName) {
        switch (handlerName) {
            case "findAllToDosByUser":
                return applicationContext.getBean(FindAllToDoHandlerRequest.class);
            case "createToDo":
                return applicationContext.getBean(CreateToDoHandlerRequest.class);
            default:
                throw new IllegalArgumentException("Handler not found");
        }
    }
}
