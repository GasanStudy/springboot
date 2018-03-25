package com.todo.web;

import com.todo.domain.member.MemberRepository;
import com.todo.dto.member.MemberMainResponseDto;
import com.todo.dto.member.MemberSaveRequestDto;
import com.todo.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {

    private MemberService memberService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @GetMapping("/{cusId}")
    public MemberMainResponseDto findMember(Long cusId) {
        return memberService.readOneMember(cusId);
    }

    @PostMapping("/register")
    public Long saveMember(@RequestBody MemberSaveRequestDto dto){
        return memberService.save(dto);
    }
    @DeleteMapping("/delete/{cusId}")
    public void deleteMember(Long cusId){
        memberService.delete(cusId);
    }

}