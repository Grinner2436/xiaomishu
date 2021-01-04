package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.NewsMessage;

public class NewsSecretary implements Secretary<NewsMessage, NewsSecretary>{
    @Override
    public NewsMessage transcribe() {
        return null;
    }

    @Override
    public NewsSecretary record(String content) {

        return null;
    }

    @Override
    public void communicate() {

    }
}
