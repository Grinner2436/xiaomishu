package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.Message;

public interface Secretary<T extends Message,S extends Secretary> {
    /**
     * 誊抄
     * @return
     */
    T transcribe();

    /**
     * 速记
     * @param content
     * @return
     */
    S record(String content);

    /**
     * 传话
     */
    void communicate();
}
