package com.todo.service;

import com.todo.domain.member.Member;
import com.todo.domain.member.MemberRepository;
import com.todo.dto.member.MemberSaveRequestDto;
import com.todo.dto.member.MemberMainResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Transactional
    public Long save(MemberSaveRequestDto dto){
        return memberRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public MemberMainResponseDto readOneMember(Long cusId){
        Member entitiy = memberRepository.getOne(cusId);
        return new MemberMainResponseDto(entitiy);
    }

    @Transactional
    public void delete(Long cusId){
        memberRepository.deleteById(cusId);
    }

}
