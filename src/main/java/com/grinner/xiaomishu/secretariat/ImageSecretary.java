package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.TextMessage;

public class ImageSecretary implements Secretary<TextMessage, ImageSecretary>{
    @Override
    public TextMessage transcribe() {
        return null;
    }

    @Override
    public ImageSecretary record(String content) {

        return null;
    }

    @Override
    public void communicate() {

    }
}
