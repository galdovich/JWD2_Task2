package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

import java.util.ArrayList;
import java.util.List;

public class Text implements Component {
    private final String title;
    private final List<Component> text;

    public Text() {
        this.title = "";
        this.text = new ArrayList<>();
    }

    public Text(String title) {
        this.title = title;
        this.text = new ArrayList<>();
    }

    public Text(String title, List<Component> text) {
        this.title = title;
        this.text = text;
    }

    public List<Component> getText() {
        return text;
    }

    public void addTextComponent(Component component) {
        text.add(component);
    }

    @Override
    public String getComponent() {
        StringBuilder sb = new StringBuilder();
        for (Component c : text) {
            sb.append(c.getComponent());
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Text text1 = (Text) o;

        if (title != null ? !title.equals(text1.title) : text1.title != null) {
            return false;
        }
        return text != null ? text.equals(text1.text) : text1.text == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Component c : text) {
            sb.append(c.getComponent());
        }

        return sb.toString();
    }
}
