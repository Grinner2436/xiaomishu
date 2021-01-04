package com.grinner.xiaomishu.message;

import com.grinner.xiaomishu.message.content.Text;
import lombok.Data;

@Data
public class TextMessage extends Message {
    private Text text;

    @Override
    protected void setMsgtype() {
        this.setMsgtype(MsgType.text);
    }
}
