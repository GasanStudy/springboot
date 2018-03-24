package com.todo.dto.member;

import com.todo.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberSaveRequestDto {

    private String email;
    private String name;
    private String password;

    @Builder
    public MemberSaveRequestDto(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public Member toEntity(){
        return Member.builder()
                .email(email)
                .name(name)
                .password(password)
                .build();
    }


}
