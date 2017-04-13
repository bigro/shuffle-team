package com.shuffle.team;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class ShuffledTeams implements Iterable<ShuffledTeam>{

    List<ShuffledTeam> list = new ArrayList<>();

    public ShuffledTeams() {
        this(new ArrayList<>());
    }

    public ShuffledTeams(List<ShuffledTeam> list) {
        this.list = list;
    }

    public List<ShuffledTeam> getList() {
        return list;
    }

    public void setList(List<ShuffledTeam> list) {
        this.list = list;
    }

    @Override
    public Iterator<ShuffledTeam> iterator() {
        return list.iterator();
    }

}
