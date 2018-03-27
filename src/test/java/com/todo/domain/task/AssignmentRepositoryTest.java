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
public class AssignmentRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

//
//    @Test
//    public void 회원목록_불러오기() {
//        //given
//    	taskRepository.save(Task.builder()
//                .title("test")
//                .content("test")
//                .build());
//
//        //when
//        List<Task> tasklist = taskRepository.findAll();
//
//        //then
//        Task task = tasklist.get(1);
//        assertThat(task.getTitle(), is("test"));
//        assertThat(task.getContent(), is("test"));
//    }

 
}