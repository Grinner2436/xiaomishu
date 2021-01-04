package com.grinner.xiaomishu.message;

import com.grinner.xiaomishu.message.content.MarkDown;
import lombok.Data;

@Data
public class MarkDownMessage extends Message {
    private MarkDown markdown;

    @Override
    protected void setMsgtype() {
        this.setMsgtype(MsgType.markdown);
    }
}
