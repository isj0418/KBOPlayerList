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

    public Page<KBOPlayerDTO> findPlayers(String team, String position, Pageable pageable) {
        Page<KBOPlayerEntity> kboPlayerEntityPage;
        Long totalItemCount;

        // 페이지 번호를 1 감소하여 조정
        int adjustedPageNumber = pageable.getPageNumber() - 1;
        Pageable adjustedPageable = PageRequest.of(adjustedPageNumber, pageable.getPageSize());

        if (team != null && !team.isEmpty() && position != null && !position.isEmpty()) {
            kboPlayerEntityPage = kboPlayerRepository.findAllByPlayerTeamAndPlayerPosition(team, position, adjustedPageable);
            totalItemCount = kboPlayerRepository.countByPlayerTeamAndPlayerPosition(team, position);
        } else if (team != null && !team.isEmpty()) {
            kboPlayerEntityPage = kboPlayerRepository.findAllByPlayerTeam(team, adjustedPageable);
            totalItemCount = kboPlayerRepository.countByPlayerTeam(team);
        } else if (position != null && !position.isEmpty()) {
            kboPlayerEntityPage = kboPlayerRepository.findAllByPlayerPosition(position, adjustedPageable);
            totalItemCount = kboPlayerRepository.countByPlayerPosition(position);
        } else {
            // Handle the case where both team and position are not selected
            kboPlayerEntityPage = kboPlayerRepository.findAll(adjustedPageable);
            totalItemCount = kboPlayerRepository.count();
        }

        List<KBOPlayerDTO> kboPlayerDTOList = new ArrayList<>();
        for (KBOPlayerEntity kboPlayerEntity : kboPlayerEntityPage) {
            kboPlayerDTOList.add(KBOPlayerDTO.toKBOPlayerDTO(kboPlayerEntity));
        }

        return new PageImpl<>(kboPlayerDTOList, pageable, totalItemCount);
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
