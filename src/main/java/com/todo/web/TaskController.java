package com.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.domain.task.Task;
import com.todo.domain.task.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	TaskRepository tr;

	@GetMapping("/list")
	public List<Task> list(Task task) {
		
		if(task!=null) {
			return tr.findByContentOrTitle(task.getContent(),task.getTitle());
		}
		return tr.findAll();
	}
	
	
	@PostMapping("/save")
	public void save(Task task) {
		 tr.save(task);
	}
	
	@PostMapping("/delete")
	public void delete(Task task) {
		 tr.deleteById(task.getId());
	}
	
	@PostMapping("/update")
	public void update(Task task) {
		 Task t = tr.getOne(task.getId());
		 t = task;
		 tr.save(t);
		 
	}
}
