package com.shuffle.team;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by ooguro on 2017/04/03.
 */
@Controller
public class ShuffleTeamController {

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("members",new TeamMembers());
        model.addAttribute("joinMembers",new JoinMembers());
        return "top";
    }

    @PostMapping("shuffle")
    String shuffle(@ModelAttribute("joinMembers") JoinMembers joinMembers, Model model) {
        ShuffledTeams shuffledTeams = joinMembers.shuffle();
        model.addAttribute("shuffledTeams", shuffledTeams);
        return "shuffle";
    }
}
