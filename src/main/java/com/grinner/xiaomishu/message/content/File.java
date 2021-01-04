package com.grinner.xiaomishu.message.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class File {
    //文件id，通过下文的文件上传接口获取
    @JsonProperty("media_id")
    private String mediaId;
}
