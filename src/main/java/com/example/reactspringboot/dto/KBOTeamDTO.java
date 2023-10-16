package com.example.reactspringboot.dto;

import com.example.reactspringboot.entity.KBOTeamEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class KBOTeamDTO {
    private Long team_Id;
    private String team_Ranking;
    private String team_Name;
    private String team_Game;
    private String team_Win;
    private String team_Lose;
    private String team_Draw;
    private String team_Win_Rate;
    private String team_Games_Behind;
    private String team_Last_Ten_Games;
    private String team_Continuity;
    private String team_Home_Record;
    private String team_Away_Record;

    // Entity -> DTO
    public static KBOTeamDTO toKBOTeamDTO(KBOTeamEntity kboTeamEntity) {
        KBOTeamDTO kboTeamDTO = new KBOTeamDTO();
        kboTeamDTO.setTeam_Id(kboTeamEntity.getTeam_Id());
        kboTeamDTO.setTeam_Ranking(kboTeamEntity.getTeam_Ranking());
        kboTeamDTO.setTeam_Name(kboTeamEntity.getTeam_Name());
        kboTeamDTO.setTeam_Game(kboTeamEntity.getTeam_Game());
        kboTeamDTO.setTeam_Win(kboTeamEntity.getTeam_Win());
        kboTeamDTO.setTeam_Lose(kboTeamEntity.getTeam_Lose());
        kboTeamDTO.setTeam_Draw(kboTeamEntity.getTeam_Draw());
        kboTeamDTO.setTeam_Win_Rate(kboTeamEntity.getTeam_Win_Rate());
        kboTeamDTO.setTeam_Games_Behind(kboTeamEntity.getTeam_Games_Behind());
        kboTeamDTO.setTeam_Last_Ten_Games(kboTeamEntity.getTeam_Last_Ten_Games());
        kboTeamDTO.setTeam_Continuity(kboTeamEntity.getTeam_Continuity());
        kboTeamDTO.setTeam_Home_Record(kboTeamEntity.getTeam_Home_Record());
        kboTeamDTO.setTeam_Away_Record(kboTeamEntity.getTeam_Away_Record());
        return kboTeamDTO;
    }
}
