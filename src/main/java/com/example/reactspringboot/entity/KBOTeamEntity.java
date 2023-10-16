package com.example.reactspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "kbo_teamdata")
public class KBOTeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long team_Id;

    @Column
    private String team_Ranking;
    @Column
    private String team_Name;
    @Column
    private String team_Game;
    @Column
    private String team_Win;
    @Column
    private String team_Lose;
    @Column
    private String team_Draw;
    @Column
    private String team_Win_Rate;
    @Column
    private String team_Games_Behind;
    @Column
    private String team_Last_Ten_Games;
    @Column
    private String team_Continuity;
    @Column
    private String team_Home_Record;
    @Column
    private String team_Away_Record;
}
