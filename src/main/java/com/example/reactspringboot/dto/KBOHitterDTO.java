package com.example.reactspringboot.dto;

import com.example.reactspringboot.entity.KBOHitterEntity;
import com.example.reactspringboot.entity.KBOPitcherEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KBOHitterDTO {
    private Long player_Id;
    private String player_Name;
    private String player_href;
    private String player_Team;
    private String player_AVG;
    private String player_Game;
    private String player_AB;
    private String player_R;
    private String player_H;
    private String player_2B;
    private String player_3B;
    private String player_HR;

    // Entity -> DTO
    public static KBOHitterDTO toKBOHitterDTO(KBOHitterEntity kboHitterEntity){
        KBOHitterDTO kboHitterDTO = new KBOHitterDTO();
        kboHitterDTO.setPlayer_Id(kboHitterEntity.getPlayer_Id());
        kboHitterDTO.setPlayer_Name(kboHitterEntity.getPlayer_Name());
        kboHitterDTO.setPlayer_href(kboHitterEntity.getPlayer_Href());
        kboHitterDTO.setPlayer_Team(kboHitterEntity.getPlayer_Team());
        kboHitterDTO.setPlayer_AVG(kboHitterEntity.getPlayer_AVG());
        kboHitterDTO.setPlayer_Game(kboHitterEntity.getPlayer_Game());
        kboHitterDTO.setPlayer_AB(kboHitterEntity.getPlayer_AB());
        kboHitterDTO.setPlayer_R(kboHitterEntity.getPlayer_R());
        kboHitterDTO.setPlayer_H(kboHitterEntity.getPlayer_H());
        kboHitterDTO.setPlayer_2B(kboHitterEntity.getPlayer_2B());
        kboHitterDTO.setPlayer_3B(kboHitterEntity.getPlayer_3B());
        kboHitterDTO.setPlayer_HR(kboHitterEntity.getPlayer_HR());
        return kboHitterDTO;
    }
}
