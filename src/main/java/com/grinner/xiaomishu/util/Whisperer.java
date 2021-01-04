package com.grinner.xiaomishu.util;

import com.grinner.xiaomishu.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Whisperer {


    @Autowired
    private RestTemplate restTemplate;


    @Value("${mishu.hook}")
    private String hook;

    public void whisper(Message message) {
        //TODO 对于机器人的响应做封装处理
        Object response = restTemplate.postForObject(hook,message,Object.class, new String[0]);
        System.out.println(response);
    }
}
