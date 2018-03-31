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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 100)
    String title;

    @Column(length = 200)
    String content;

    @Column(name = "share_code", nullable = false)
    Integer  shareCode = 1;

    @Column(name = "start")
    String start;

    @Column(name = "end")
    String end;


    @OneToMany(mappedBy = "taskId")
    private List<Assignment> assignments;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name= "member_id")
    private Long taskMemberId;



}