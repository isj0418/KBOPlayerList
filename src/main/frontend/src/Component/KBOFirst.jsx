import React, { useState } from "react";
import PlayerList from "./PlayerList";
import TeamData from "./TeamData";

export default function KBOFirst() {

    function goToTeamData () {
        window.location.href = "/teamData"
    }

    function goToPlayerList () {
        window.location.href = "/playerList"
    }

    return (
        <div>
            <h2>KBO DATA</h2>
            <button onClick={goToTeamData}>KBO Team</button>
            <button onClick={goToPlayerList}>KBO Player</button>
        </div>
    );
}

