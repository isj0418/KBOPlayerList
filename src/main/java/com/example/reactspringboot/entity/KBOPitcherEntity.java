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
@Table(name = "kbo_pitcher")
public class KBOPitcherEntity {
    @Id
    @Column(name = "player_id")
    private Long player_Id;

    @Column(name = "player_name")
    private String player_Name;
    @Column(name = "player_href")
    private String player_Href;
    @Column(name = "player_team")
    private String player_Team;
    @Column(name = "player_era")
    private String player_ERA;
    @Column(name = "player_game")
    private String player_Game;
    @Column(name = "player_win")
    private String player_Win;
    @Column(name = "player_lose")
    private String player_Lose;
    @Column(name = "player_save")
    private String player_Save;
    @Column(name = "player_hld")
    private String player_HLD;
    @Column(name = "player_wpct")
    private String player_WPCT;
    @Column(name = "player_image_url")
    private String player_Image_Url;


}
