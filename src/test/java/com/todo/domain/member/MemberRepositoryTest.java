package com.todo.domain.member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.soap.MTOM;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MemberRepositoryTest{

    @Mock private MemberRepository memberRepository;
    @Mock private Member member;
    @Test
    public void 회원등록() {
        //given
//        given(memberRepository.findById()).willReturn(member.builder().email("").name("").password("")
//                .birthDate("").emailYN("").snsFacebook("").snsGoogle("").snsNaver("").telNum("").build());

    }

//    @Test
//    public void BaseTimeEntity_등록 () {
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
//    }
}