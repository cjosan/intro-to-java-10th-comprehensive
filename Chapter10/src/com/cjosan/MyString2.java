package com.cjosan;

/**
 * Created by admin on 21.06.2017.
 */
public class MyString2 {
    private String value;

    public MyString2(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public int compare(String s) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += (int)value.charAt(i);
        }

        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum2 += (int)s.charAt(i);
        }

        if (sum > sum2)
            return 1;
        else if (sum < sum2)
            return -1;
        else
            return 0;
    }

    public MyString2 substring(int begin) {
        String str = "";
        for (int i = begin; i < value.length(); i++) {
            str += value.charAt(i);
        }

        return new MyString2(str);
    }

    public MyString2 toUpperCase() {
        String str = "";
        for (int i = 0; i < value.length(); i++) {
            str += Character.toUpperCase(value.charAt(i));
        }

        return new MyString2(str);
    }

    public char[] toChars() {
        char[] chars = new char[value.length()];

        for (int i = 0; i < value.length(); i++) {
            chars[i] = value.charAt(i);
        }

        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        if (b)
            return new MyString2("true");
        else
            return new MyString2("false");
    }
}
