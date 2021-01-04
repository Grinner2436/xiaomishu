package com.grinner.xiaomishu.message.content;

import lombok.Data;

@Data
public class Article {
    private String title;
    private String description;
    //点击后跳转的链接,必填
    private String url;
    //图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图 1068*455，小图150*150。非必填
    private String picurl;
}
