package com.todo.domain.task;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;


public interface TaskRepository extends JpaRepository<Task, Long> {

}

