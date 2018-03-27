package com.todo.domain.task;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.assignment.Assignment;
import com.todo.domain.member.Member;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
public class Task extends BaseTimeEntity {

    @Id
    @GeneratedValue
    Long id;

    String title;

    String content;

    @Column(name = "remind_code")
    String  remindCode;

    @Column(name = "share_code")
    String  shareCode;

    @Column(name = "start_date")
    Date    startDate;

    @Column(name = "end_date")
    Date    endDate;

    @Column(name = "start_time")
    Date    startTime;

    @Column(name = "end_time")
    Date    endTime;


    @OneToMany(mappedBy = "taskId")
    private List<Assignment> assignments;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name= "member_id")
    private Long taskMemberId;


    @Builder

    public Task(String title, String content, String remindCode, String shareCode, Date startDate, Date endDate, Date startTime, Date endTime, List<Assignment> assignments, Long taskMemberId) {
        this.title = title;
        this.content = content;
        this.remindCode = remindCode;
        this.shareCode = shareCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.assignments = assignments;
        this.taskMemberId = taskMemberId;
    }
}