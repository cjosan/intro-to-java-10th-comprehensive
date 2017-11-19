package com.cjosan;

/**
 * Created by admin on 21.06.2017.
 */
public class MyString1 {
    private char[] value;

    public MyString1(char[] chars) {
        value = new char[chars.length];
        System.arraycopy(chars, 0, value, 0, chars.length);
    }

    public char[] getValue() {
        return value;
    }

    public char charAt(int index) {
        return value[index];
    }

    public int length() {
        int length = 0;
        for (char ch : value) {
            length++;
        }
        return length;
    }

    public MyString1 substring(int begin, int end) {
        char[] substring = new char[end - begin];
        System.arraycopy(value, begin, substring, 0, substring.length);

        return new MyString1(substring);
    }

    public MyString1 toLowerCase() {
        char[] lowerCase = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            lowerCase[i] = Character.toLowerCase(value[i]);
        }

        return new MyString1(lowerCase);
    }

    public boolean equals(MyString1 s) {
        if (value.length != s.getValue().length)
            return false;

        for (int i = 0; i < value.length; i++) {
            if (value[i] != s.getValue()[i])
                return false;
        }

        return true;
    }

    public static MyString1 valueOf(int i) {
        int length = 0;
        int number = i;
        while (number > 0) {
            length++;
            number /= 10;
        }

        char[] temp = new char[length];

        for (int j = length - 1; j >= 0; j--) {
            temp[j] = (char)((i % 10) + '0');
            i /= 10;
        }

        return new MyString1(temp);
    }
}
