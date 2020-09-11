package com.galdovich.task2.service.impl;

import com.galdovich.task2.entity.impl.Sentence;
import com.galdovich.task2.entity.impl.Text;
import com.galdovich.task2.entity.impl.Word;

import java.util.List;

public interface TextService {

    // Task 2
    List<Sentence> formSentencesAscending(Text text);

    // Task 5
    List<Sentence> formSentenceOppositeReplacementFirstLastWords(Text text);

    // Task 9
    List<Word> formSortedWordsByLetter(Text text, String letter);
}
