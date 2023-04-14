package com.secondhandmarket.secondhandmarket.repository;

import com.secondhandmarket.secondhandmarket.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}
