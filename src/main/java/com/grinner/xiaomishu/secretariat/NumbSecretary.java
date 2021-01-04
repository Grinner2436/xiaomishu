package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.TextMessage;

public class NumbSecretary implements Secretary<TextMessage, NumbSecretary>{

    @Override
    public TextMessage transcribe() {
        return new TextMessage();
    }

    @Override
    public NumbSecretary record(String content) {

        return null;
    }

    @Override
    public void communicate() {

    }
}
