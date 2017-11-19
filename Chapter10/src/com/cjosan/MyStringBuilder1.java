package com.cjosan;

/**
 * Created by admin on 22.06.2017.
 */
public class MyStringBuilder1 {
    private String value;

    public MyStringBuilder1(String value) {
        this.value = value;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        value += s.toString();
        return this;
    }

    public MyStringBuilder1 append(int i) {
        value += i;
        return this;
    }

    public int length() {
        return value.length();
    }

    public char charAt(int index) {
        return value.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            temp += Character.toLowerCase(value.charAt(i));
        }
        value = temp;

        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String temp = "";
        for (int i = begin; i < end; i++) {
            temp += value.charAt(i);
        }
        value = temp;

        return this;
    }

    public String toString() {
        return value;
    }
}
