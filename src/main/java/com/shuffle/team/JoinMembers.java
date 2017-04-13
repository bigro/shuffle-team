package com.shuffle.team;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ooguro on 2017/04/03.
 */
public class JoinMembers implements Iterable<Member> {

    List<Member> list = new ArrayList<>();

    public JoinMembers() {
        this(new ArrayList<>());
    }

    public JoinMembers(List<Member> list) {
        this.list = list;
    }

    public static JoinMembers of(List<NickName> nickNames) {
        List<Member> members = nickNames.stream()
                .map(nickName -> new Member(nickName))
                .collect(Collectors.toList());
        return new JoinMembers(members);
    }

    public List<Member> getList() {
        return list;
    }

    public void setList(List<Member> list) {
        this.list = list;
    }

    @Override
    public Iterator<Member> iterator() {
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
