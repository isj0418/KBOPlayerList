package com.example.reactspringboot.service;

import com.example.reactspringboot.dto.KBOHitterDTO;
import com.example.reactspringboot.dto.KBOPitcherDTO;
import com.example.reactspringboot.entity.KBOHitterEntity;
import com.example.reactspringboot.entity.KBOPitcherEntity;
import com.example.reactspringboot.repository.KBOHitterRepository;
import com.example.reactspringboot.repository.KBOPitcherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.reactspringboot.dto.KBOPlayerDTO;
import com.example.reactspringboot.entity.KBOPlayerEntity;
import com.example.reactspringboot.repository.KBOPlayerRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KBOPlayerService {
    private final KBOPlayerRepository kboPlayerRepository;
    private final KBOPitcherRepository kboPitcherRepository;
    private final KBOHitterRepository kboHitterRepository;

    public List<KBOPlayerDTO> findAllPlayers() {
        List<KBOPlayerEntity> kboPlayerEntities = kboPlayerRepository.findAll();
        List<KBOPlayerDTO> kboPlayerDTOList = new ArrayList<>();
        for (KBOPlayerEntity kboPlayerEntity : kboPlayerEntities) {
            kboPlayerDTOList.add(KBOPlayerDTO.toKBOPlayerDTO(kboPlayerEntity));
        }
        return kboPlayerDTOList;
    }

    public KBOPitcherDTO findPitcher(Long playerId) {
        Optional<KBOPitcherEntity> kboPitcherEntity = kboPitcherRepository.findById(playerId);
        KBOPitcherDTO kboPitcherDTO = new KBOPitcherDTO();
        if( kboPitcherEntity.isPresent()){
            kboPitcherDTO = KBOPitcherDTO.toKBOPitcherDTO(kboPitcherEntity.get());
        }
        return kboPitcherDTO;
    }

    public KBOHitterDTO findHitter(Long playerId) {
        Optional<KBOHitterEntity> kboHitterEntity = kboHitterRepository.findById(playerId);
        KBOHitterDTO kboHitterDTO = new KBOHitterDTO();
        if ( kboHitterEntity.isPresent()){
            kboHitterDTO = KBOHitterDTO.toKBOHitterDTO(kboHitterEntity.get());
        }
        return kboHitterDTO;
    }
}
