package com.todo.domain.member;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;


public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT m " +
            "FROM Member m " +
            "ORDER BY m.id DESC")
    Stream<Member> findAllDesc();
}

