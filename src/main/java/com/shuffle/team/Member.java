package com.shuffle.team;

/**
 * Created by ooguro on 2017/04/03.
 */
public class Member {
    NickName nickName = new NickName("");

    public Member() {
    }

    public Member(NickName nickName) {
        this.nickName = nickName;
    }

    public NickName getNickName() {
        return nickName;
    }

    public void setNickName(NickName nickName) {
        this.nickName = nickName;
    }
}
