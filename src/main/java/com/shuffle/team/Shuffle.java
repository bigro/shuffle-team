package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/13.
 */
public class Shuffle {
    CheckedNickNames checkedNickNames;
    TeamCount teamCount;

    public Shuffle() {
        this(new CheckedNickNames(),new TeamCount());
    }

    public Shuffle(CheckedNickNames checkedNickNames, TeamCount teamCount) {
        this.checkedNickNames = checkedNickNames;
        this.teamCount = teamCount;
    }

    public CheckedNickNames getCheckedNickNames() {
        return checkedNickNames;
    }

    public void setCheckedNickNames(CheckedNickNames checkedNickNames) {
        this.checkedNickNames = checkedNickNames;
    }

    public TeamCount getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(TeamCount teamCount) {
        this.teamCount = teamCount;
    }
}
