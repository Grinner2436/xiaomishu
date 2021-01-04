package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.MarkDownMessage;

public class MarkDownSecretary implements Secretary<MarkDownMessage, MarkDownSecretary>{
    @Override
    public MarkDownMessage transcribe() {
        return null;
    }

    @Override
    public MarkDownSecretary record(String content) {

        return null;
    }

    @Override
    public void communicate() {

    }
}
