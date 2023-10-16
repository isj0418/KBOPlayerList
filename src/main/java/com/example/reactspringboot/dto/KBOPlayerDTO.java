package com.example.reactspringboot.dto;

import com.example.reactspringboot.entity.KBOPlayerEntity;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KBOPlayerDTO {
    private Long player_Id;
    private String player_Num;
    private String player_Name;
    private String player_Team;
    private String player_Position;
    private Date player_Birth;
    private String player_Physical;

    // Entity -> DTO
    public static KBOPlayerDTO toKBOPlayerDTO(KBOPlayerEntity KBOPlayerEntity){
        KBOPlayerDTO KBOPlayerDTO = new KBOPlayerDTO();
        KBOPlayerDTO.setPlayer_Id(KBOPlayerEntity.getPlayer_Id());
        KBOPlayerDTO.setPlayer_Num(KBOPlayerEntity.getPlayerNum());
        KBOPlayerDTO.setPlayer_Name(KBOPlayerEntity.getPlayerName());
        KBOPlayerDTO.setPlayer_Team(KBOPlayerEntity.getPlayerTeam());
        KBOPlayerDTO.setPlayer_Position(KBOPlayerEntity.getPlayerPosition());
        KBOPlayerDTO.setPlayer_Birth(KBOPlayerEntity.getPlayerBirth());
        KBOPlayerDTO.setPlayer_Physical(KBOPlayerEntity.getPlayerPhysical());
        return KBOPlayerDTO;
    }

}
