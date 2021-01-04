package com.grinner.xiaomishu.message;

import com.grinner.xiaomishu.message.content.News;
import lombok.Data;

@Data
public class NewsMessage extends Message {
    private News news;

    @Override
    protected void setMsgtype() {
        this.setMsgtype(MsgType.news);
    }
}
