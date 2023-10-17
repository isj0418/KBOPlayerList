import React, { useEffect, useState } from "react";
import axios from 'axios';
import { Link } from 'react-router-dom';
import Pagination from "./Pagination";
import PitcherDetail from './PitcherDetail';
import HitterDetail from './HitterDetail';
import '../css/stylesPlayerList.css';

export default function PlayerList({teamFilter}) {
    const [playerList, setPlayerList] = useState([]);
    const [positionFilter, setPositionFilter] = useState("");
    const [totalItemCount, setTotalItemCount] = useState(0);
    const [page, setPage] = useState(1);
    const pageSize = 20;
    const [selectedPlayer, setSelectedPlayer] = useState(null);

    useEffect(() => {
        // 페이지 변경 및 필터 변경 시에 데이터 가져오도록 변경
        axios.get(`/api/playerList?team=${teamFilter}&position=${positionFilter}&page=${page}&pageSize=${pageSize}`)
            .then(response => {
                setPlayerList(response.data.content);
                setTotalItemCount(response.data.totalElements); // Update to use totalElements
            })
            .catch(error => console.error(error));
    }, [page, teamFilter, positionFilter]);

    const formatBirthDate = (dateString) => {
        const options = { year: 'numeric', month: '2-digit', day: '2-digit' };
        return new Date(dateString).toLocaleDateString(undefined, options);
    };

    // Handle filter changes
/*    const handleTeamFilterChange = (event) => {
        setTeamFilter(event.target.value);
        setPage(1);
    };*/

    const handlePositionFilterChange = (event) => {
        setPositionFilter(event.target.value);
        setPage(1);
    };

    const handlePageChange = (newPage) => {
        setPage(newPage);
    };

    // 선수를 클릭했을 때 디테일 정보를 보여주는 함수
    const handlePlayerClick = (player) => {
        // playerId를 이용하여 선수 디테일 정보를 가져오거나 다른 작업을 수행합니다.
        console.log(player);
        if (player && player.player_Id) {
            setSelectedPlayer(player);
        }
        //console.log(selectedPlayer.player_Id);
    };

    return (
        <div>
            <div className="selectDiv">
                <label> TeamFilter: </label>
                <span><strong> {teamFilter} </strong></span>

                <label> PositionFilter: </label>
                <select onChange={handlePositionFilterChange} value={positionFilter}>
                    <option value="">포지션 선택</option>
                    <option value="투수">투수</option>
                    <option value="포수">포수</option>
                    <option value="내야수">내야수</option>
                    <option value="외야수">외야수</option>
                </select>
            </div>
            <div className="player-list-container">
                <table className={"playerTable"}>
                    <thead>
                        <tr>
                            <th>등번호</th>
                            <th>선수명</th>
                            <th>팀명</th>
                            <th>포지션</th>
                            <th>생년월일</th>
                            <th>체격</th>
                        </tr>
                    </thead>
                    <tbody>
                    {playerList.map(player => (
                        <tr key={player.player_Id}>
                            <td>{player.player_Num}</td>
                            <td onClick={ () => handlePlayerClick(player)}>
                                {player.player_Name}
                            </td>
                            <td>{player.player_Team}</td>
                            <td>{player.player_Position}</td>
                            <td>{formatBirthDate(player.player_Birth)}</td>
                            <td>{player.player_Physical}</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            </div>
            {selectedPlayer != null && (
                // 여기에서 모달 또는 팝업 컴포넌트를 렌더링하거나 스타일을 변경
                <div className="modal">
                    <div className="modal-content">
                        {/* 선택된 선수의 정보를 여기에 렌더링 */}
                        {selectedPlayer.player_Position === '투수' ? (
                            <PitcherDetail playerId={selectedPlayer.player_Id} />
                        ) : (
                            <HitterDetail playerId={selectedPlayer.player_Id} />
                        )}
                    </div>
                    <button onClick={() => setSelectedPlayer(null)}>닫기</button>
                </div>
            )}

            <div>
                <Pagination
                    currentPage={page}
                    pageSize={pageSize}
                    totalItems={totalItemCount}
                    onPageChange={handlePageChange}
                />
            </div>
        </div>
    );
}
