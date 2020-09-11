package com.galdovich.task2.service.impl.comparator;

import com.galdovich.task2.entity.impl.Word;

import java.util.Comparator;

public class WordComparatorAlphabetically implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        return o1.getWord().compareTo(o2.getWord());
    }
}
