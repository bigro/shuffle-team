package com.shuffle.team;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Team implements Iterable<Name> {
    List<Name> members = new ArrayList<>();

    public Team() {
        this(new ArrayList<>());
    }

    public Team(List<Name> members) {
        this.members = members;
    }

    public List<Name> getMembers() {
        return members;
    }

    public void setMembers(List<Name> members) {
        this.members = members;
    }

    @Override
    public Iterator<Name> iterator() {
        return members.iterator();
    }
}
