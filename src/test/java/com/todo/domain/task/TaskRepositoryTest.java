package com.todo.domain.task;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTest {

    @Autowired
    TaskRepository tr;

   

    @Test
    public void task_전체조회하기() {
        List<Task> tasklist = tr.findAll();
    }
    
    @Test
    public void task_tite과content추가하기() {
    	 	Task task = new Task();
    		task.setTitle("title");
    		task.setContent("content");
    		tr.save(task);
    }
    
    @Test
    public void task_전체조회후_첫번째_task삭제하기() {
    	List<Task> tasklist = tr.findAll();
    		tr.deleteById(tasklist.get(0).getId());
    }
    
    @Test
    public void task_전체조회후_첫번째_task수정하기() {
    		List<Task> tasklist = tr.findAll();
    		tasklist.get(0).setContent("updateContent");
    		tasklist.get(0).setTitle("updateTitle");
    		tr.save(tasklist.get(0));
    }
    
    @Test
    public void task등록할때_assign지정안해주는경우() {
  
    }
    @Test
    public void task등록할때_assign지정해주는경우() {
    	
    }
    @Test
    public void assign_받았을때_승낙또는거절하는경우() {
    	
    }
    @Test
    public void assign_카테고리등록및수정하기() {  	
    
    }
    @Test
    public void task_카테고리삭제하기() {
    	
    }
    @Test
    public void assign_카테고리이동하기() {
    	
    }
    @Test
    public void assign_삭제하기() {
    	
    }
}
