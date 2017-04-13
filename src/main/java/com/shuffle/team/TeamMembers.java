package com.shuffle.team;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class TeamMembers implements Iterable<Member>{

    List<Member> list = new ArrayList<>();

    public TeamMembers() {
        list.add(new Member(new NickName("大畔")));
        list.add(new Member(new NickName("津野")));
        list.add(new Member(new NickName("グチ")));
        list.add(new Member(new NickName("エーロン")));
        list.add(new Member(new NickName("ちぐ")));
        list.add(new Member(new NickName("たっちゃん")));
        list.add(new Member(new NickName("ケーシ")));
        list.add(new Member(new NickName("きーちゃん")));
        list.add(new Member(new NickName("坂本")));
        list.add(new Member(new NickName("畑野")));
        list.add(new Member(new NickName("荒川")));
        list.add(new Member(new NickName("静馬")));
        list.add(new Member(new NickName("りょう")));
        list.add(new Member(new NickName("アズマ")));
        list.add(new Member(new NickName("カイト")));
    }

    public List<Member> getList() {
        return list;
    }

    @Override
    public Iterator<Member> iterator() {
        return list.iterator();
    }
}
