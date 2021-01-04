package com.grinner.xiaomishu.message.content;

import lombok.Data;

@Data
public class Image {
    private String content;
    //图片内容的base64编码
    private String base64;
    //图片内容（base64编码前）的md5值
    private String md5;
}
