package com.burnus.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burnus.all.entity.DiaryEntity;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Integer> {


}
