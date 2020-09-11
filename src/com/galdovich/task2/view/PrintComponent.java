package com.galdovich.task2.view;

import com.galdovich.task2.entity.Component;

import java.util.List;

public class PrintComponent {

    public void print(List<? extends Component> components) {
        StringBuilder buff = new StringBuilder();
        for (Component c : components) {
            buff.append(c.getComponent()).append("\n");
        }
        System.out.println(buff.toString());
    }
}
