import React, { useEffect, useState } from "react";
import axios from 'axios';
import { Link } from 'react-router-dom';
import Pagination from "./Pagination";
import '../css/stylesPlayerList.css';

export default function PlayerListFirst() {
    const [playerList, setPlayerList] = useState([]);
    const [teamFilter, setTeamFilter] = useState("");
    const [positionFilter, setPositionFilter] = useState("");
    const [totalItemCount, setTotalItemCount] = useState(0);
    const [page, setPage] = useState(1);
    const pageSize = 20;

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
    const handleTeamFilterChange = (event) => {
        setTeamFilter(event.target.value);
        setPage(1);
    };

    const handlePositionFilterChange = (event) => {
        setPositionFilter(event.target.value);
        setPage(1);
    };

    const handlePageChange = (newPage) => {
        setPage(newPage);
    };

    console.log(playerList);
    return (
        <div>
            <div className="selectDiv">
                <label> TeamFilter: </label>
                <select onChange={handleTeamFilterChange} value={teamFilter}>
                    <option value="">팀 선택</option>
                    <option value="LG">LG</option>
                    <option value="KT">KT</option>
                    <option value="NC">NC</option>
                    <option value="SSG">SSG</option>
                    <option value="두산">두산</option>
                    <option value="KIA">KIA</option>
                    <option value="롯데">롯데</option>
                    <option value="삼성">삼성</option>
                    <option value="한화">한화</option>
                    <option value="키움">키움</option>
                </select>

                <label> PositionFilter: </label>
                <select onChange={handlePositionFilterChange} value={positionFilter}>
                    <option value="">포지션 선택</option>
                    <option value="투수">투수</option>
                    <option value="포수">포수</option>
                    <option value="내야수">내야수</option>
                    <option value="외야수">외야수</option>
                </select>
            </div>
            <div >
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
                            <td>
                                {player.player_Position === '투수' ? (
                                    <Link to={`/pitcherDetail/${player.player_Id}`}>
                                        {player.player_Name}
                                    </Link>
                                ) : (
                                    <Link to={`/hitterDetail/${player.player_Id}`}>
                                        {player.player_Name}
                                    </Link>
                                )}
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
