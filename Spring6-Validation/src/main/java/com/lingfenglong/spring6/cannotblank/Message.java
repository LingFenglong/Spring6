package com.lingfenglong.spring6.cannotblank;

import java.util.Objects;

public class Message {
    @CannotBlank
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public Message() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(msg, message.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg);
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
