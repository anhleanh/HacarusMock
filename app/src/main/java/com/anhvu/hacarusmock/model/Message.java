package com.anhvu.hacarusmock.model;

/**
 * Created by leanh on 10/15/16.
 */

public class Message {

    private String message;

    private boolean isSelf;

    public Message(String message, boolean isSelf) {
        this.message = message;
        this.isSelf = isSelf;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSelf() {
        return isSelf;
    }

    public void setSelf(boolean self) {
        isSelf = self;
    }
}
