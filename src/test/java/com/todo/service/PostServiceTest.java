package com.todo.service;

import com.todo.domain.member.Member;
import com.todo.domain.member.MemberRepository;
import com.todo.dto.member.MemberSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @After
    public void cleanup () {
        memberRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_member테이블에_저장된다 () {
        //given
        MemberSaveRequestDto dto = MemberSaveRequestDto.builder()
                .email("test@email.com")
                .name("테스트")
                .password("1234")
                .build();

        //when
        memberService.save(dto);

        //then
        Member member = memberRepository.findAll().get(0);
        assertThat(member.getEmail()).isEqualTo(dto.getEmail());
        assertThat(member.getName()).isEqualTo(dto.getName());
        assertThat(member.getPassword()).isEqualTo(dto.getPassword());
    }

}
