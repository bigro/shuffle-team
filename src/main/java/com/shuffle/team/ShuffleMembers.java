package com.shuffle.team;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class ShuffleMembers implements Iterable<Name> {

    List<Name> list = new ArrayList<>();

    public ShuffleMembers() {
        this(new ArrayList<>());
    }

    public ShuffleMembers(List<Name> list) {
        this.list = list;
    }

    public List<Name> getList() {
        return list;
    }

    public void setList(List<Name> list) {
        this.list = list;
    }

    @Override
    public Iterator<Name> iterator() {
        return list.iterator();
    }

    public ShuffleTeams shuffle() {
        Collections.shuffle(list);
        int q = (list.size() / 2);
        int surplus = list.size() % 2;

        List<Team> teams = new ArrayList<>();
        int from = 0;
        for (int i = 0; i < 2; i++) {
            Team team = new Team(list.subList(from, from + q + surplus));
            teams.add(team);
            from = q + surplus;
            surplus = surplus - 1 < 1 ? 0 : surplus - 1;
        }
        return new ShuffleTeams(teams);
    }
}
