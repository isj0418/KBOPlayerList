package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface KBOPlayerRepository extends JpaRepository<KBOPlayerEntity, Long> {
}
