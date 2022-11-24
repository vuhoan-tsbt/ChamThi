package com.example.chamthi.repository;

import com.example.chamthi.entity.ExamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamUserRepository extends JpaRepository<ExamUser, Long> {
}
