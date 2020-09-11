package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

public class Digit implements Component {
    private final String digit;

    public Digit(String digit) {
        this.digit = digit;
    }

    @Override
    public String getComponent() {
        return digit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Digit digit1 = (Digit) o;

        return digit != null ? digit.equals(digit1.digit) : digit1.digit == null;
    }

    @Override
    public int hashCode() {
        return digit != null ? digit.hashCode() : 0;
    }

    @Override
    public String toString() {
        return digit;
    }
}
