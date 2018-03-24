package com.todo.service;

import com.todo.domain.member.MemberRepository;
import com.todo.dto.member.MemberMainResponseDto;
import com.todo.dto.member.MemberSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Transactional
    public Long save(MemberSaveRequestDto dto){
        return memberRepository.save(dto.toEntity()).getId();
    }

}
