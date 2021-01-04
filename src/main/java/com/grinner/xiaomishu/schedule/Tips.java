package com.grinner.xiaomishu.schedule;

import com.grinner.xiaomishu.message.TextMessage;
import com.grinner.xiaomishu.secretariat.Secretariat;
import com.grinner.xiaomishu.secretariat.TextSecretary;
import com.grinner.xiaomishu.util.Whisperer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tips {

    @Autowired
    private Whisperer whisperer;

    /**
     * 点饭
     */
    @Scheduled(cron = "0 0,5 11 ? * 1,2,3,4,5")
    public void order() {

    }

    /**
     * 吃饭
     */
    @Scheduled(cron = "0 50,55 11 ? * 1,2,3,4,5")
    public void eat() {

    }

    /**
     * 午休
     */
    @Scheduled(cron = "0 40,45 12 ? * 1,2,3,4,5")
    public void sleep() {

    }

    /**
     * 打卡，下班
     */
    @Scheduled(cron = "0 31,35 17 ? * 1,2,3,4,5")
    public void getoff() {
        // 秘书处分配秘书
        TextSecretary textSecretary = Secretariat.dispatch(TextSecretary.class);
        // 秘书速记信息,誊写信息
        TextMessage message = textSecretary.record("打卡，下班！")
                .at("张三").at("李四").圈儿所有人()
                .transcribe();
        // 通讯员传达信息
        whisperer.whisper(message);
    }
}
