package com.example.balu6.chats;

import java.util.Date;

/**
 * Created by balu6 on 09.03.2016.
 */
public class ChatItem {

    private String name;

    private String lastMsg;

    private Date lastMsgDate;

    public ChatItem(String name, String lastMsg, Date lastMsgDate) {
        this.name = name;
        this.lastMsg = lastMsg;
        this.lastMsgDate = lastMsgDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public Date getLastMsgDate() {
        return lastMsgDate;
    }

    public void setLastMsgDate(Date lastMsgDate) {
        this.lastMsgDate = lastMsgDate;
    }
}
