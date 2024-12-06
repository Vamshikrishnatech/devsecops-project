package net.java.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
