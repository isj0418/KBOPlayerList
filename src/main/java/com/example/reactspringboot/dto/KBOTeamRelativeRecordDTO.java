package com.example.reactspringboot.dto;

import com.example.reactspringboot.entity.KBOTeamRelativeRecordEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KBOTeamRelativeRecordDTO {
    private Long team_Id;
    private String team_Name;
    private String team_Vs1st_WLD;
    private String team_Vs2nd_WLD;
    private String team_Vs3rd_WLD;
    private String team_Vs4th_WLD;
    private String team_Vs5th_WLD;
    private String team_Vs6th_WLD;
    private String team_Vs7th_WLD;
    private String team_Vs8th_WLD;
    private String team_Vs9th_WLD;
    private String team_Vs10th_WLD;
    private String team_Total_WLD;


    // Entity -> DTO
    public static KBOTeamRelativeRecordDTO toKBOTeamRelativeRecordDTO(KBOTeamRelativeRecordEntity kboTeamRelativeRecordEntity) {
        KBOTeamRelativeRecordDTO kboTeamRelativeRecordDTO = new KBOTeamRelativeRecordDTO();
        kboTeamRelativeRecordDTO.setTeam_Id(kboTeamRelativeRecordEntity.getTeam_Id());
        kboTeamRelativeRecordDTO.setTeam_Name(kboTeamRelativeRecordEntity.getTeam_Name());
        kboTeamRelativeRecordDTO.setTeam_Vs1st_WLD(kboTeamRelativeRecordEntity.getTeam_Vs1st_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs2nd_WLD(kboTeamRelativeRecordEntity.getTeam_Vs2nd_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs3rd_WLD(kboTeamRelativeRecordEntity.getTeam_Vs3rd_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs4th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs4th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs5th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs5th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs6th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs6th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs7th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs7th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs8th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs8th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs9th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs9th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Vs10th_WLD(kboTeamRelativeRecordEntity.getTeam_Vs10th_WLD());
        kboTeamRelativeRecordDTO.setTeam_Total_WLD(kboTeamRelativeRecordEntity.getTeam_Total_WLD());
        return kboTeamRelativeRecordDTO;
    }
}
