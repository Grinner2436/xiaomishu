package com.grinner.xiaomishu.message.content;

import lombok.Data;

import java.util.List;

@Data
public class News {
    //图文消息，一个图文消息支持1到8条图文
    private List<Article> articles;
}
