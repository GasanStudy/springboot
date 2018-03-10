package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.Repository.SampleRepository;
import com.example.demo.vo.MemberVO;
import com.example.demo.vo.SampleVO;


@RestController
@RequestMapping("/member")

public class TestController {

	@Autowired
	MemberRepository mr;

	@RequestMapping("/hello")

	public String sayHello() {

		return "Hello Worldsssssssss!";

	}

	@RequestMapping("/list")

	public List<MemberVO> sendVO() {

		List<MemberVO> vo = mr.findAll();

		return vo;

	}

}
