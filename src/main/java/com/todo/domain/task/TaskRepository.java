package com.todo.domain.task;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;


public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByContentOrTitle(String content, String title);

	



}

