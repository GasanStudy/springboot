package com.todo.web;

import com.todo.domain.member.MemberRepository;
import com.todo.dto.member.MemberSaveRequestDto;
import com.todo.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@AllArgsConstructor //lombok이 생성자 관리해줌
public class WebRestController {

    private MemberService memberService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/member")
    public Long saveMember(@RequestBody MemberSaveRequestDto dto){
        return memberService.save(dto);
    }

}