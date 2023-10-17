package com.example.reactspringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "kbo_hitter")
public class KBOHitterEntity {
    @Id
    @Column(name = "player_id")
    private Long player_Id;

    @Column(name = "player_name")
    private String player_Name;
    @Column(name = "player_href")
    private String player_Href;
    @Column(name = "player_team")
    private String player_Team;
    @Column(name = "player_avg")
    private String player_AVG;
    @Column(name = "player_game")
    private String player_Game;
    @Column(name = "player_ab")
    private String player_AB;
    @Column(name = "player_r")
    private String player_R;
    @Column(name = "player_h")
    private String player_H;
    @Column(name = "player_2b")
    private String player_2B;
    @Column(name = "player_3b")
    private String player_3B;
    @Column(name = "player_hr")
    private String player_HR;
    @Column(name = "player_image_url")
    private String player_Image_Url;
}
