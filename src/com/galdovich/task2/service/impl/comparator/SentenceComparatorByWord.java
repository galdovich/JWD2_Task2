package com.galdovich.task2.service.impl.comparator;

import com.galdovich.task2.entity.Component;
import com.galdovich.task2.entity.impl.Sentence;
import com.galdovich.task2.entity.impl.Word;

import java.util.Comparator;

public class SentenceComparatorByWord implements Comparator<Sentence> {

    @Override
    public int compare(Sentence o1, Sentence o2) {
        int countWordInFirstSentence = 0;
        int countWordInSecondSentence = 0;
        for (Component c : o1.getPartsOfSentence()) {
            if (c.getClass().equals(Word.class)) {
                countWordInFirstSentence++;
            }
        }
        for (Component c : o2.getPartsOfSentence()) {
            if (c.getClass().equals(Word.class)) {
                countWordInSecondSentence++;
            }
        }
        return countWordInFirstSentence - countWordInSecondSentence;
    }
}
