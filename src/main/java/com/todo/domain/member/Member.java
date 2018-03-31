package com.todo.domain.member;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.assignment.Assignment;
import com.todo.domain.category.Category;
import com.todo.domain.task.Task;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	String email;

	String name;

	String password;

	@Column(name = "birth_date")
	Date birthDate;

	@Column(name = "tel_num")
	String telNum;

	@Column(name = "email_yn")
	Integer emailYN;

	@Column(name = "sns_facebook")
	String snsFacebook;

	@Column(name = "sns_google")
	String snsGoogle;

	@Column(name = "sns_naver")
	String snsNaver;

	@OneToMany(mappedBy = "categoryMemberId")
	private List<Category> categories;

	@OneToMany(mappedBy = "assignmentMemberId")
	private List<Assignment> assignments;

	@OneToMany(mappedBy = "taskMemberId")
	private List<Task> tasks;

	@Builder
	public Member(String email, String name, String password, Date birthDate, String telNum, Integer emailYN, String snsFacebook, String snsGoogle, String snsNaver, List<Category> categories, List<Assignment> assignments, List<Task> tasks) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.birthDate = birthDate;
		this.telNum = telNum;
		this.emailYN = emailYN;
		this.snsFacebook = snsFacebook;
		this.snsGoogle = snsGoogle;
		this.snsNaver = snsNaver;
		this.categories = categories;
		this.assignments = assignments;
		this.tasks = tasks;
	}
}