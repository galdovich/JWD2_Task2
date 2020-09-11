package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

public class Word implements Component {
    private final String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String getComponent() {
        return word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return word != null ? word.equals(word1.word) : word1.word == null;
    }

    @Override
    public int hashCode() {
        return word != null ? word.hashCode() : 0;
    }

    @Override
    public String toString() {
        return word;
    }
}
