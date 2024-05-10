package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
