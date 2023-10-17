// src/main/frontend/src/App.js

import React from 'react';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import KBO from "./Component/KBO";
import PlayerList from "./Component/PlayerList";
import TeamData from "./Component/TeamData";
import PitcherDetail from './Component/PitcherDetail';
import HitterDetail from './Component/HitterDetail';

function App() {

    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/" element={<KBO />} />
                <Route exact path="/playerList" element={<PlayerList/>} />
                <Route exact path="/teamData" element={<TeamData/>}/>
                <Route exact path="/pitcherDetail/:playerId" element={<PitcherDetail />} />{/* 투수 상세 페이지 */}
                <Route exact path="/hitterDetail/:playerId" element={<HitterDetail />} /> {/* 타자 상세 페이지 */}
            </Routes>
        </BrowserRouter>
    );
}
export default App;