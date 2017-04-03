package com.shuffle.team;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ooguro on 2017/04/03.
 */
@Controller
public class ShuffleTeamController {

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("members",new Members());
        model.addAttribute("shuffleMembers",new ShuffleMembers());
        return "top";
    }

    @PostMapping("shuffle")
    String shuffle(@ModelAttribute("shuffleMembers") ShuffleMembers shuffleMembers, Model model) {
        ShuffleTeams shuffleTeams = shuffleMembers.shuffle();
        model.addAttribute("shuffleTeams",shuffleTeams);
        return "shuffle";
    }
}
