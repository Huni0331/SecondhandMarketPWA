package com.secondhandmarket.secondhandmarket.repository;

import com.secondhandmarket.secondhandmarket.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
}
