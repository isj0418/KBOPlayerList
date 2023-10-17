package com.example.reactspringboot.entity;

import com.example.reactspringboot.dto.KBOPlayerDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table (name = "kbo_players")
public class KBOPlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long player_Id;

    @Column(name = "player_Num")
    private String playerNum;
    @Column(name = "player_Name")
    private String playerName;
    @Column(name = "player_Team")
    private String playerTeam;
    @Column(name = "player_Position")
    private String playerPosition;
    @Column(name = "player_Birth")
    private Date playerBirth;
    @Column(name = "player_Physical")
    private String playerPhysical;

    // DTO -> Entity
    public static KBOPlayerEntity toSaveEntity(KBOPlayerDTO KBOPlayerDTO){
        KBOPlayerEntity KBOPlayerEntity = new KBOPlayerEntity();
        KBOPlayerEntity.setPlayerNum(KBOPlayerDTO.getPlayer_Num());
        KBOPlayerEntity.setPlayerName(KBOPlayerDTO.getPlayer_Name());
        KBOPlayerEntity.setPlayerTeam(KBOPlayerDTO.getPlayer_Team());
        KBOPlayerEntity.setPlayerPosition(KBOPlayerDTO.getPlayer_Position());
        KBOPlayerEntity.setPlayerBirth(KBOPlayerDTO.getPlayer_Birth());
        KBOPlayerEntity.setPlayerPhysical(KBOPlayerDTO.getPlayer_Physical());
        return KBOPlayerEntity;
    }

}
