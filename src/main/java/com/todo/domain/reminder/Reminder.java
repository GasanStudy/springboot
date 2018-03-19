package com.todo.domain.reminder;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.task.Task;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Reminder extends BaseTimeEntity {

    @Id
    @GeneratedValue
    Long id;

    @Column(name = "code_id")
    Long codeId;


    @Column(name = "date_time")
    Date dateTime;

    @ManyToOne(targetEntity = Task.class)
    @JoinColumn(name = "task_id")
    Long taskId;

    @Builder
    public Reminder(Long codeId, Date dateTime, Long taskId) {
        this.codeId = codeId;
        this.dateTime = dateTime;
        this.taskId = taskId;
    }
}