package com.galdovich.task2.entity.impl;

import com.galdovich.task2.entity.Component;

public class CodeBlock implements Component {
    private final String codeBlock;

    public CodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }

    @Override
    public String getComponent() {
        return codeBlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeBlock codeBlock1 = (CodeBlock) o;

        return codeBlock != null ? codeBlock.equals(codeBlock1.codeBlock) : codeBlock1.codeBlock == null;
    }

    @Override
    public int hashCode() {
        return codeBlock != null ? codeBlock.hashCode() : 0;
    }

    @Override
    public String toString() {
        return codeBlock;
    }
}
