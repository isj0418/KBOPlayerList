import React, {useEffect, useState}  from "react";
import axios from 'axios';
export default function TeamData() {
    const [teamRank, setTeamRank] = useState([])
    const [teamRelativeRecord, setRelativeRecord] = useState([])

    useEffect(() => {
        axios.get('/api/teamRank')
            .then(response => {
                console.log(response.data)
                setTeamRank(response.data)
            })
            .catch(error => console.log(error))
    }, []);

    useEffect(() => {
        axios.get('/api/teamRelativeRecord')
            .then(response => {
                console.log(response.data)
                setRelativeRecord(response.data)
            })
            .catch(error => console.log(error))
    }, [])
/*    const formatBirthDate = (dateString) => {
        const options = {year: 'numeric', month: '2-digit', day:'2-digit'};
        return new Date(dateString).toLocaleDateString(undefined, options)
    };*/
    return (
        <div>
            <h2>teamRanking</h2>
            <table>
                <thead>
                <tr>
                    <th>순위</th>
                    <th>이름</th>
                    <th>경기</th>
                    <th>승</th>
                    <th>패</th>
                    <th>무</th>
                    <th>승률</th>
                    <th>경기차</th>
                    <th>최근 10경기</th>
                    <th>연속</th>
                    <th>홈</th>
                    <th>원정</th>
                </tr>
                </thead>
                <tbody>
                {teamRank.map(team => (
                    <tr key={team.team_Id}>
                        <td>{team.team_Ranking}</td>
                        <td>{team.team_Name}</td>
                        <td>{team.team_Game}</td>
                        <td>{team.team_Win}</td>
                        <td>{team.team_Lose}</td>
                        <td>{team.team_Draw}</td>
                        <td>{team.team_Win_Rate}</td>
                        <td>{team.team_Games_Behind}</td>
                        <td>{team.team_Last_Ten_Games}</td>
                        <td>{team.team_Continuity}</td>
                        <td>{team.team_Home_Record}</td>
                        <td>{team.team_Away_Record}</td>
                    </tr>
                ))}
                </tbody>
            </table>

            <h2>teamRelativeRecord</h2>
            <table>
                <thead>
                    <tr>
                        <td>
                            팀명
                        </td>
                        {teamRelativeRecord.map(record  => (
                        <td key={record.team_Id}>
                            {record.team_Name} <br/>
                            (승-패-무)
                        </td>
                        ))}
                    </tr>
                </thead>

                <tbody>
                {teamRelativeRecord.map(record  => (
                    <tr key={record.team_Id}>
                        <td>{record.team_Name}</td>
                        <td>{record.team_Vs1st_WLD}</td>
                        <td>{record.team_Vs2nd_WLD}</td>
                        <td>{record.team_Vs3rd_WLD}</td>
                        <td>{record.team_Vs4th_WLD}</td>
                        <td>{record.team_Vs5th_WLD}</td>
                        <td>{record.team_Vs6th_WLD}</td>
                        <td>{record.team_Vs7th_WLD}</td>
                        <td>{record.team_Vs8th_WLD}</td>
                        <td>{record.team_Vs9th_WLD}</td>
                        <td>{record.team_Vs10th_WLD}</td>
                        <td>{record.team_Total_WLD}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    )
}