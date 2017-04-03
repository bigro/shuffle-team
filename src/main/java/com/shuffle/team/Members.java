package com.shuffle.team;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Members implements Iterable<Member>{

    List<Member> list = new ArrayList<>();

    public Members() {
        list.add(new Member(new Identifier(1L),new Name("大畔")));
        list.add(new Member(new Identifier(2L),new Name("津野")));
        list.add(new Member(new Identifier(3L),new Name("グチ")));
        list.add(new Member(new Identifier(4L),new Name("エーロン")));
        list.add(new Member(new Identifier(5L),new Name("ちぐ")));
        list.add(new Member(new Identifier(6L),new Name("たっちゃん")));
        list.add(new Member(new Identifier(7L),new Name("ケーシ")));
        list.add(new Member(new Identifier(8L),new Name("きーちゃん")));
        list.add(new Member(new Identifier(9L),new Name("坂本")));
        list.add(new Member(new Identifier(11L),new Name("畑野")));
        list.add(new Member(new Identifier(12L),new Name("荒川")));
        list.add(new Member(new Identifier(13L),new Name("静馬")));
        list.add(new Member(new Identifier(14L),new Name("りょう")));
        list.add(new Member(new Identifier(15L),new Name("アズマ")));
        list.add(new Member(new Identifier(16L),new Name("カイト")));
    }

    public List<Member> getList() {
        return list;
    }

    @Override
    public Iterator<Member> iterator() {
        return list.iterator();
    }
}
