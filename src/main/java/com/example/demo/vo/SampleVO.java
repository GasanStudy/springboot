package com.example.demo.vo;

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
@Table(name="sample")
public class SampleVO {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer mno;

	  private String firstName;

	  private String lastName;

	}



