package com.secondhandmarket.secondhandmarket.repository;

import com.secondhandmarket.secondhandmarket.entity.LikyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikyRepository extends JpaRepository<LikyEntity, Integer> {
}
