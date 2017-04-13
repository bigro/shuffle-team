package com.shuffle.team;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class JoinMembers implements Iterable<NickName> {

    List<NickName> list = new ArrayList<>();

    public JoinMembers() {
        this(new ArrayList<>());
    }

    public JoinMembers(List<NickName> list) {
        this.list = list;
    }

    public List<NickName> getList() {
        return list;
    }

    public void setList(List<NickName> list) {
        this.list = list;
    }

    @Override
    public Iterator<NickName> iterator() {
        return list.iterator();
    }

    public ShuffledTeams shuffle() {
        Collections.shuffle(list);
        int q = (list.size() / 2);
        int surplus = list.size() % 2;

        List<ShuffledTeam> teams = new ArrayList<>();
        int from = 0;
        for (int i = 0; i < 2; i++) {
            ShuffledTeam team = new ShuffledTeam(list.subList(from, from + q + surplus));
            teams.add(team);
            from = q + surplus;
            surplus = surplus - 1 < 1 ? 0 : surplus - 1;
        }
        return new ShuffledTeams(teams);
    }
}
