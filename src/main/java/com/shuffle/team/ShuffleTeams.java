package com.shuffle.team;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class ShuffleTeams implements Iterable<Team>{

    List<Team> list = new ArrayList<>();

    public ShuffleTeams() {
        this(new ArrayList<>());
    }

    public ShuffleTeams(List<Team> list) {
        this.list = list;
    }

    public List<Team> getList() {
        return list;
    }

    public void setList(List<Team> list) {
        this.list = list;
    }

    @Override
    public Iterator<Team> iterator() {
        return list.iterator();
    }

}
