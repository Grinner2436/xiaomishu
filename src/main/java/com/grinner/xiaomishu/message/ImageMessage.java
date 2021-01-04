package com.grinner.xiaomishu.message;

import com.grinner.xiaomishu.message.content.Image;
import lombok.Data;

@Data
public class ImageMessage extends Message {
    private Image image;

    @Override
    protected void setMsgtype() {
        this.setMsgtype(MsgType.image);
    }
}
