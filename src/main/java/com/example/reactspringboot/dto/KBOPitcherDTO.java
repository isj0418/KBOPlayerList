package com.example.reactspringboot.dto;

import com.example.reactspringboot.entity.KBOPitcherEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KBOPitcherDTO {
    private Long player_Id;
    private String player_Name;
    private String player_href;
    private String player_Team;
    private String player_ERA;
    private String player_Game;
    private String player_Win;
    private String player_Lose;
    private String player_Save;
    private String player_HLD;
    private String player_WPCT;
    private String player_Image_Url;

    // Entity -> DTO
    public static KBOPitcherDTO toKBOPitcherDTO(KBOPitcherEntity kboPitcherEntity){
        KBOPitcherDTO kboPitcherDTO = new KBOPitcherDTO();
        kboPitcherDTO.setPlayer_Id(kboPitcherEntity.getPlayer_Id());
        kboPitcherDTO.setPlayer_Name(kboPitcherEntity.getPlayer_Name());
        kboPitcherDTO.setPlayer_href(kboPitcherEntity.getPlayer_Href());
        kboPitcherDTO.setPlayer_Team(kboPitcherEntity.getPlayer_Team());
        kboPitcherDTO.setPlayer_ERA(kboPitcherEntity.getPlayer_ERA());
        kboPitcherDTO.setPlayer_Game(kboPitcherEntity.getPlayer_Game());
        kboPitcherDTO.setPlayer_Win(kboPitcherEntity.getPlayer_Win());
        kboPitcherDTO.setPlayer_Lose(kboPitcherEntity.getPlayer_Lose());
        kboPitcherDTO.setPlayer_Save(kboPitcherEntity.getPlayer_Save());
        kboPitcherDTO.setPlayer_HLD(kboPitcherEntity.getPlayer_HLD());
        kboPitcherDTO.setPlayer_WPCT(kboPitcherEntity.getPlayer_WPCT());
        kboPitcherDTO.setPlayer_Image_Url(kboPitcherEntity.getPlayer_Image_Url());
        return kboPitcherDTO;
    }

}
