package com.ciazhar.latihanuts.model;

/**
 * Created by ciazhar on 10/31/17.
 * <p>
 * [ Documentation Here]
 */

public class Sender {
    private String subject;
    private String email;
    private String body;

    public Sender(String subject, String email, String body) {
        this.subject = subject;
        this.email = email;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toJson() {
        return  '\"' + "sender"  + '\"' + ":" + "{" +
                '\"' + "subject" + '\"' + ":" + '\"' + subject + '\"' + "," +
                '\"' + "email"   + '\"' + ":" + '\"' + email   + '\"' + "," +
                '\"' + "body:"   + '\"' + ":" + '\"' + body    + '\"' +
                '}';
    }
}
