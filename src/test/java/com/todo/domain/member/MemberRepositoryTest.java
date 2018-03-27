package com.todo.domain.member;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


    @After
    public void cleanup() {
        memberRepository.deleteAll();
    }

    @Test
    public void 회원목록_불러오기() {
//        //given
//        memberRepository.save(Member.builder()
//                .email("test@email.com")
//                .name("테스트")
//                .build());
//
//        //when
//        List<Member> memberList = memberRepository.findAll();
//
//        //then
//        Member member = memberList.get(0);
//        assertThat(member.getName(), is("테스트"));
//        assertThat(member.getEmail(), is("test@email.com"));
    }

    @Test
    public void BaseTimeEntity_등록 () {
//        //given
//        LocalDateTime now = LocalDateTime.now();
//
//        memberRepository.save(Member.builder()
//                .email("jojoldu@gmail.com")
//                .name("테스트")
//                .build());
//        //when
//        List<Member> memberList = memberRepository.findAll();
//
//        //then
//        Member member = memberList.get(0);
//        assertTrue(member.getCreatedDate().isAfter(now));
//        assertTrue(member.getModifiedDate().isAfter(now));

    }
}