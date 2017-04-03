package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Name {

    String value = "";

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
