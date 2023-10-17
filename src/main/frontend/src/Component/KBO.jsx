import React, { useState } from "react";
import PlayerList from "./PlayerList";
import TeamData from "./TeamData";

export default function KBO() {
    const [teamFilter, setTeamFilter] = useState("KT");
    const [showPlayerList, setShowPlayerList] = useState(false);
    const [showTeamData, setShowTeamData] = useState(true);

    function togglePlayerList() {
        setShowPlayerList(true);
        setShowTeamData(false);
    }

    function toggleTeamData() {
        setShowPlayerList(false);
        setShowTeamData(true);
    }

    return (
        <div>
            <div>
                <h2>KBO DATA</h2>
                <button onClick={toggleTeamData}>KBO Team</button>
                <button onClick={togglePlayerList}>KBO Player</button>
            </div>

            {showTeamData && <TeamData />}
            {showPlayerList && <PlayerList teamFilter={teamFilter}/>}
        </div>
    );
}

/*import React, { useState } from "react";
import PlayerList from "./PlayerList";
import TeamData from "./TeamData";

export default function KBO() {
    const [showPlayerList, setShowPlayerList] = useState(false);
    const [showTeamData, setShowTeamData] = useState(true);

    function togglePlayerList() {
        setShowPlayerList(true);
        setShowTeamData(false);
    }

    function toggleTeamData() {
        setShowPlayerList(false);
        setShowTeamData(true);
    }

    return (
        <div>
            <div>
                <h2>KBO DATA</h2>
                <button onClick={toggleTeamData}>KBO Team</button>
                <button onClick={togglePlayerList}>KBO Player</button>
            </div>

            {showTeamData && <TeamData />}
            {showPlayerList && <PlayerList teamFilter={teamFilter}/>}
        </div>
    );

    onclick function에서
    window.location.href ~ 어쩌고 했던것 같음
}*/
