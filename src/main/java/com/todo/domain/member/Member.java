package com.todo.domain.member;

import com.todo.domain.BaseTimeEntity;
import com.todo.domain.assignment.Assignment;
import com.todo.domain.category.Category;
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
	@GeneratedValue
	private Long id;

	String email;

	String name;

	String Password;

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

	@Builder
	public Member(String email, String name, String password, Date birthDate, String telNum, Integer emailYN, String snsFacebook, String snsGoogle, String snsNaver, List<Category> categories, List<Assignment> assignments) {
		this.email = email;
		this.name = name;
		Password = password;
		this.birthDate = birthDate;
		this.telNum = telNum;
		this.emailYN = emailYN;
		this.snsFacebook = snsFacebook;
		this.snsGoogle = snsGoogle;
		this.snsNaver = snsNaver;
		this.categories = categories;
		this.assignments = assignments;
	}
}