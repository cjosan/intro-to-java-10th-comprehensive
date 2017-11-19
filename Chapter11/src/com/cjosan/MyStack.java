package com.cjosan;

import java.util.ArrayList;

/**
 * Created by admin on 28.06.2017.
 */
public class MyStack extends ArrayList{

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        Object o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + this.toString();
    }
}
