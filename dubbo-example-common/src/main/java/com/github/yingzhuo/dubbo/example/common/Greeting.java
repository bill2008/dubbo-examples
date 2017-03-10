package com.github.yingzhuo.dubbo.example.common;

import java.io.Serializable;

public class Greeting implements Serializable {

    private static final long serialVersionUID = -4518490442843289611L;

    private String name;
    private String text;

    public Greeting() {
        super();
    }

    public Greeting(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
