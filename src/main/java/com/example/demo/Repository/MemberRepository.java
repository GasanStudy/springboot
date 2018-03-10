package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.MemberVO;



public interface MemberRepository extends JpaRepository<MemberVO, Integer> {

}
