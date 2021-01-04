package com.grinner.xiaomishu.message.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Text {
    private String content;
    //userid的列表，提醒群中的指定成员(@某个成员)，@all表示提醒所有人，
    //如果开发者获取不到userid，可以使用mentioned_mobile_list

    @JsonProperty("mentioned_list")
    private List<String> mentionedList;
    //手机号列表，提醒手机号对应的群成员(@某个成员)，@all表示提醒所有人

    @JsonProperty("mentioned_mobile_list")
    private List<String> mentionedMobileList;

}
