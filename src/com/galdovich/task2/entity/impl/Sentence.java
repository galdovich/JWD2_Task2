package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Component {
    private final List<Component> partsOfSentence;

    public Sentence() {
        partsOfSentence = new ArrayList<>();
    }

    @Override
    public String getComponent() {
        StringBuilder sb = new StringBuilder();

        for (Component c : partsOfSentence) {
            sb.append(c.getComponent());
        }

        return sb.toString();
    }

    public List<Component> getPartsOfSentence() {
        return partsOfSentence;
    }

    public void addPart(Component component) {
        partsOfSentence.add(component);
    }

    public void addPart(int index, Component component) {
        partsOfSentence.add(index, component);
    }

    public void removePart(Component component) {
        partsOfSentence.remove(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return partsOfSentence != null ? partsOfSentence.equals(sentence.partsOfSentence) : sentence.partsOfSentence == null;
    }

    @Override
    public int hashCode() {
        return partsOfSentence != null ? partsOfSentence.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Component c : partsOfSentence) {
            sb.append(c.getComponent());
        }

        return sb.toString();
    }
}
