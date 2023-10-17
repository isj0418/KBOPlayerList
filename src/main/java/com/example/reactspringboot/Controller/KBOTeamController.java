package com.example.reactspringboot.Controller;

import com.example.reactspringboot.dto.KBOTeamDTO;
import com.example.reactspringboot.dto.KBOTeamRelativeRecordDTO;
import com.example.reactspringboot.service.KBOTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class KBOTeamController {
    private final KBOTeamService kboTeamService;

    @GetMapping("/teamRank")
    public List<KBOTeamDTO> findRankAll() {
        System.out.println(kboTeamService.findRankAll());
        return kboTeamService.findRankAll();
    }

    @GetMapping("/teamRelativeRecord")
    public List<KBOTeamRelativeRecordDTO> findRecordAll() {
        System.out.println(kboTeamService.findRecordAll());
        return kboTeamService.findRecordAll();
    }
}
