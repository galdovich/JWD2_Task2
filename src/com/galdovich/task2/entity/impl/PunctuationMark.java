package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

public class PunctuationMark implements Component {
    private final String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String getComponent() {
        return punctuationMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PunctuationMark that = (PunctuationMark) o;

        return punctuationMark != null ? punctuationMark.equals(that.punctuationMark) : that.punctuationMark == null;
    }

    @Override
    public int hashCode() {
        return punctuationMark != null ? punctuationMark.hashCode() : 0;
    }

    @Override
    public String toString() {
        return punctuationMark;
    }
}
