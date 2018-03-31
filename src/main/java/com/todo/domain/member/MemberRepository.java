package com.todo.domain.member;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;


public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findAllBystring(String name);



}

