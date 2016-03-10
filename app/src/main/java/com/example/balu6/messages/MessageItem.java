package com.example.balu6.messages;

/**
 * Created by balu6 on 08.03.2016.
 */
public class MessageItem {

    private String text;

    private boolean isMyMsg;

    public MessageItem(String text) {
        this.text = text;
    }

    public MessageItem(String text, boolean isMyMsg) {
        this.text = text;
        this.isMyMsg = isMyMsg;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isMyMsg() {
        return isMyMsg;
    }

    public void setIsMyMsg(boolean isMyMsg) {
        this.isMyMsg = isMyMsg;
    }
}
