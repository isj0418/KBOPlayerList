package com.example.reactspringboot.repository;

import com.example.reactspringboot.entity.KBOPitcherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KBOPitcherRepository extends JpaRepository<KBOPitcherEntity, Long> {

}
