package com.todo.domain.code;

import com.todo.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Code extends BaseTimeEntity {

    @Id
    @GeneratedValue
    Long id;


    String code;


    @Column(name = "code_value")
    String codeValue;

    @Column(name = "code_desc")
    String codeDesc;

    @Column(name = "code_value_desc")
    String codeValueDesc;

}