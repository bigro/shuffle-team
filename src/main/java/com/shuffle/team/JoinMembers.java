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

    public ShuffledTeams shuffle(TeamCount teamCount) {
        Collections.shuffle(list);
        int q = (list.size() / teamCount.getValue());
        int surplus = list.size() % teamCount.getValue();

        List<ShuffledTeam> teams = new ArrayList<>();
        int from = 0;
        for (int i = 0; i < teamCount.getValue(); i++) {
            int addMember = surplus > 0 ? 1 : 0;
            ShuffledTeam team = new ShuffledTeam(list.subList(from, from + q + addMember));
            teams.add(team);
            from += q + addMember;
            surplus = surplus - 1 < 1 ? 0 : surplus - 1;
        }
        return new ShuffledTeams(teams);
    }
}
