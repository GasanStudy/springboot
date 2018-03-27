package com.todo.domain.category;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.assignment.Assignment;
import com.todo.domain.member.Member;
import com.todo.domain.task.Task;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Category extends BaseTimeEntity {

    @Id
    @GeneratedValue
    Long id;

    String title;

    String memo;


    @ManyToOne(targetEntity=Member.class)
    @JoinColumn(name = "member_id")
    Long categoryMemberId;

    @OneToMany(mappedBy = "assignmentId")
    private List<Assignment> assignments;


    @Builder

    public Category(String title, String memo, Long categoryMemberId, List<Assignment> assignments) {
        this.title = title;
        this.memo = memo;
        this.categoryMemberId = categoryMemberId;
        this.assignments = assignments;
    }
}