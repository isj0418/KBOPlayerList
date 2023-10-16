package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOTeamRelativeRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOTeamRelativeRecordRepository extends JpaRepository<KBOTeamRelativeRecordEntity, Long> {
}
