package com.shuffle.team;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ooguro on 2017/04/03.
 */
public class ShuffledTeam implements Iterable<Member> {
    List<Member> members = new ArrayList<>();

    public ShuffledTeam() {
        this(new ArrayList<>());
    }

    public ShuffledTeam(List<Member> members) {
        this.members = members;
    }



    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public Iterator<Member> iterator() {
        return members.iterator();
    }
}
