package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOTeamRepository extends JpaRepository<KBOTeamEntity, Long> {
}
