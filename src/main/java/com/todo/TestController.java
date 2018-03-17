package com.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.domain.member.Member;
import com.todo.domain.member.MemberRepository;

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

    public List<Member> sendVO() {

        List<Member> vo = mr.findAll();

        return vo;

    }
}
