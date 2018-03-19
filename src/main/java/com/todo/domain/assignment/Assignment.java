package com.todo.domain.assignment;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.member.Member;
import com.todo.domain.task.Task;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Assignment extends BaseTimeEntity {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "accept_yn")
    String acceptYN;

    @Column(name = "complete_yn")
    String completeYN;

    @Column(name = "complete_date")
    Date completeDate;

    @ManyToOne(targetEntity=Member.class)
    @JoinColumn(name = "member_id")
    Long assignmentMemberId;

    @ManyToOne(targetEntity=Task.class)
    @JoinColumn(name = "task_id")
    Long taskId;

    @Builder

    public Assignment(String acceptYN, String completeYN, Date completeDate, Long assignmentMemberId, Long taskId) {
        this.acceptYN = acceptYN;
        this.completeYN = completeYN;
        this.completeDate = completeDate;
        this.assignmentMemberId = assignmentMemberId;
        this.taskId = taskId;
    }
}