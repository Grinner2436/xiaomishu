package com.grinner.xiaomishu.secretariat;

import com.grinner.xiaomishu.message.TextMessage;
import com.grinner.xiaomishu.message.content.Text;
import com.grinner.xiaomishu.user.UserConstant;
import com.grinner.xiaomishu.util.Whisperer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TextSecretary implements Secretary<TextMessage, TextSecretary>{

    @Autowired
    private Whisperer whisperer;

    private StringBuffer notebook;
    private List<String> mentionedList;
    private List<String> mentionedMobileList;

    TextSecretary() {
        this.notebook = new StringBuffer();
        this.mentionedList = new ArrayList<>();
        this.mentionedMobileList = new ArrayList();
    }

    @Override
    public TextMessage transcribe() {

        Text text = new Text();
        text.setContent(notebook.toString());
        text.setMentionedList(mentionedList);
        text.setMentionedMobileList(mentionedMobileList);

        TextMessage textMessage = new TextMessage();
        textMessage.setText(text);
        return textMessage;
    }

    @Override
    public TextSecretary record(String content) {
        notebook.append(content);
        notebook.append("\r\n");
        return this;
    }

    @Override
    public void communicate() {
        TextMessage textMessage = transcribe();
        whisperer.whisper(textMessage);
    }

    public TextSecretary at(String userName){
        String uid = UserConstant.getMobile(userName);
        if(uid != null) {
            mentionedMobileList.add(uid);
        }
        return this;
    }

    public TextSecretary 圈儿(String uid){
        at(uid);
        return this;
    }

    public TextSecretary 艾特(String uid){
        at(uid);
        return this;
    }

    public TextSecretary atAll(){
        mentionedList.add(UserConstant.AT_ALL);
        return this;
    }

    public TextSecretary 艾特所有人(){
        atAll();
        return this;
    }

    public TextSecretary 圈儿所有人(){
        atAll();
        return this;
    }
}
