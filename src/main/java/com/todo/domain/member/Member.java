package com.todo.domain.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="member")
public class Member {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "id")
	  private Integer id;

	  private Integer back;

	  private String name;
	  
	  private Integer team;

	}
