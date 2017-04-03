package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Member {
    Identifier identifier = new Identifier();
    Name name = new Name("");

    public Member(Identifier identifier, Name name) {
        this.identifier = identifier;
        this.name = name;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Name getName() {
        return name;
    }
}
