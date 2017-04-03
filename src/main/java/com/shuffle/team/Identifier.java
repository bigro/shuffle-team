package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Identifier {

    Long value = 0L;

    public Identifier() {
        this(0L);
    }

    public Identifier(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
