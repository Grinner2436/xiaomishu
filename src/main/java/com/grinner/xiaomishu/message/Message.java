package com.grinner.xiaomishu.message;

import lombok.Data;

@Data
public abstract class Message {
    private MsgType msgtype;

    protected Message() {
        setMsgtype();
    }
    protected abstract void setMsgtype();
}
