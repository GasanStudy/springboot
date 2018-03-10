package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.SampleVO;

public interface SampleRepository extends JpaRepository<SampleVO, Integer> {

}
