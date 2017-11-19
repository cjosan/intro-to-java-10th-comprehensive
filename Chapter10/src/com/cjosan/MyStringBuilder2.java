package com.cjosan;

/**
 * Created by admin on 22.06.2017.
 */
public class MyStringBuilder2 {
    private String value;

    public MyStringBuilder2() {
        this("");
    }

    public MyStringBuilder2(char[] chars) {
        this(String.valueOf(chars));
    }

    public MyStringBuilder2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String begin = "";
        String end = "";

        for (int i = 0; i < value.length(); i++) {
            if (i < offset)
                begin += value.charAt(i);
            else
                end += value.charAt(i);
        }
        value = begin.concat(s.getValue()).concat(end);

        return this;
    }

    public MyStringBuilder2 reverse() {
        String temp = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            temp += value.charAt(i);
        }
        value = temp;

        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        String temp = "";

        for (int i = begin; i < value.length(); i++) {
            temp += value.charAt(i);
        }
        value = temp;

        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            temp += Character.toUpperCase(value.charAt(i));
        }
        value = temp;

        return this;
    }
}
