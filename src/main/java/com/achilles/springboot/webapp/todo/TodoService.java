package com.achilles.springboot.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn FullStack Dev", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps", LocalDate.now().plusYears(3), false));
    }


    public List<Todo> findByUsername(String username) {
        return todos.stream()
                .filter(todo -> todo.getUsername().equalsIgnoreCase(username))
                .toList();
    }

    public void addTodo(String name, String description, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(todosCount++, name, description, targetDate, isDone));
    }

    public boolean  validateTodo(String description) {
        if (description.isEmpty() || description.isBlank()) {
            return true;
        }
        return false;
    }

    public void deleteByid(int id) {
        todos.removeIf(t -> t.getId() == id);
    }

    public Todo findById(int id) {
        Todo todo = todos.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get();

        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteByid(todo.getId());
        todos.add(todo);
    }
}
