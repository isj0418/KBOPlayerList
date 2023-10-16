package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface KBOPlayerRepository extends JpaRepository<KBOPlayerEntity, Long> {


    Page<KBOPlayerEntity> findAllByPlayerTeamAndPlayerPosition(String team, String position, Pageable pageable);

    Page<KBOPlayerEntity> findAllByPlayerTeam(String team, Pageable pageable);

    Page<KBOPlayerEntity> findAllByPlayerPosition(String position, Pageable pageable);

    long countByPlayerTeamAndPlayerPosition(String team, String position);

    long countByPlayerTeam(String team);

    long countByPlayerPosition(String position);

    long count();
}
