package com.cjosan;

/**
 * Created by admin on 22.06.2017.
 */
public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compare(MyCharacter ch) {
        if (value > ch.charValue())
            return 1;
        else if (value < ch.charValue())
            return -1;
        else
            return 0;
    }

    public boolean isLowerCase() {
        return ((int)value >= 97 && (int)value <= 122);
    }

    public boolean isUpperCase() {
        return ((int)value >= 65 && (int)value <= 90);
    }

    public MyCharacter toLowerCase() {
        if (isLowerCase())
            return new MyCharacter(value);
        else
            return new MyCharacter((char)(value + 32));
    }

    public MyCharacter toUpperCase() {
        if (isUpperCase())
            return new MyCharacter(value);
        else
            return new MyCharacter((char)(value - 32));
    }

    public boolean isAlphabetical() {
        return (isLowerCase() || isUpperCase());
    }

    public boolean isDigit() {
        return ((int)value >= 48 && (int)value <= 57);
    }

    public boolean isAlphabeticalOrDigit() {
        return (isAlphabetical() || isDigit());
    }

    public MyCharacter valueOf(int i) {
        return new MyCharacter((char)(i + '0'));
    }
}
