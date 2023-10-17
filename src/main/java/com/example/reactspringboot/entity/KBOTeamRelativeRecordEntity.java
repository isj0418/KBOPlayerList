package com.example.reactspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "kbo_teamrelativerecord")
public class KBOTeamRelativeRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long team_Id;

    @Column
    private String team_Name;
    @Column
    private String team_Vs1st_WLD;
    @Column
    private String team_Vs2nd_WLD;
    @Column
    private String team_Vs3rd_WLD;
    @Column
    private String team_Vs4th_WLD;
    @Column
    private String team_Vs5th_WLD;
    @Column
    private String team_Vs6th_WLD;
    @Column
    private String team_Vs7th_WLD;
    @Column
    private String team_Vs8th_WLD;
    @Column
    private String team_Vs9th_WLD;
    @Column
    private String team_Vs10th_WLD;
    @Column
    private String team_Total_WLD;


}
