package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/13.
 */
public class TeamCount {
    int value;
    private static final int minCount = 2;

    public TeamCount() {
        this(minCount);
    }

    public TeamCount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
