package com.shuffle.team;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class ShuffledTeam implements Iterable<NickName> {
    List<NickName> members = new ArrayList<>();

    public ShuffledTeam() {
        this(new ArrayList<>());
    }

    public ShuffledTeam(List<NickName> members) {
        this.members = members;
    }

    public List<NickName> getMembers() {
        return members;
    }

    public void setMembers(List<NickName> members) {
        this.members = members;
    }

    @Override
    public Iterator<NickName> iterator() {
        return members.iterator();
    }
}
