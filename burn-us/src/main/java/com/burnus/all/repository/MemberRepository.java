package com.burnus.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.burnus.all.entity.MemberEntity;

import jakarta.persistence.EntityManager;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {


}
