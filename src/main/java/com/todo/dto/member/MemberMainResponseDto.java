package com.todo.dto.member;


import com.todo.domain.member.Member;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class MemberMainResponseDto {

    private Long id;
    private String email;
    private String name;
    private String modifiedDate;

    public MemberMainResponseDto(Member entity) {
        id = entity.getId();
        email = entity.getEmail();
        name = entity.getName();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }

}
