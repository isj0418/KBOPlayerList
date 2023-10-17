package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOHitterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOHitterRepository extends JpaRepository<KBOHitterEntity, Long> {
}
