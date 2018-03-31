package com.todo.domain.code;

import com.todo.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Code extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    String code;


    @Column(name = "code_value")
    String codeValue;

    @Column(name = "code_desc")
    String codeDesc;

    @Column(name = "code_value_desc")
    String codeValueDesc;

}