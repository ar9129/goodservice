package com.aditya.goodservice.repository;

import com.aditya.goodservice.entity.good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface goodRepository extends JpaRepository<good,Long> {
}

