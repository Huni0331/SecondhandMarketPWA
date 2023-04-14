package com.secondhandmarket.secondhandmarket.repository;

import com.secondhandmarket.secondhandmarket.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
//public interface UserRepository extends JpaRepository<엔터티, 해당엔터티의 PK 타입>
}
