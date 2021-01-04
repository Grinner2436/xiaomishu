package com.grinner.xiaomishu.message;

import com.grinner.xiaomishu.message.content.File;
import lombok.Data;

@Data
public class FileMessage extends Message {
    private File file;

    @Override
    protected void setMsgtype() {
        this.setMsgtype(MsgType.file);
    }
}
