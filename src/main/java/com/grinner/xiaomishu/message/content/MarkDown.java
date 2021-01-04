package com.grinner.xiaomishu.message.content;

import lombok.Data;

@Data
public class MarkDown {
    //markdown内容，最长不超过4096个字节，必须是utf8编码
    private String content;
}
