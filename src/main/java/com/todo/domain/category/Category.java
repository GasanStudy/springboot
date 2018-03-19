package com.todo.domain.category;

import com.todo.domain.BaseTimeEntity;
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


    @OneToMany(mappedBy = "categoryId")
    private List<Task> taskList;

    @ManyToOne(targetEntity=Member.class)
    @JoinColumn(name = "member_id")
    Long categoryMemberId;


    @Builder
    public Category(String title, String memo, Long categoryMemberId, List<Task> taskList) {
        this.title = title;
        this.memo = memo;
        this.categoryMemberId = categoryMemberId;
        this.taskList = taskList;
    }
}