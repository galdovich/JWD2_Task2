package com.galdovich.task2.dao.parser;

import com.galdovich.task2.entity.Component;
import com.galdovich.task2.entity.impl.Digit;
import com.galdovich.task2.entity.impl.PunctuationMark;
import com.galdovich.task2.entity.impl.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartOfSentenceParser {
    private final String partOfSentenceRegEx = "(\\d+)|([A-Za-zА-Яа-я]+)|(\\W+)";
    private final String wordRegEx = "[A-Za-zА-Яа-я]+";
    private final String digitRegEx = "\\d+";
    private final Pattern pattern = Pattern.compile(partOfSentenceRegEx);

    public List<Component> parsePartOfSentence(String sentence) {
        List<Component> partsOfSentence = new ArrayList<>();
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            String part = matcher.group().intern();
            if (part.matches(wordRegEx)) {
                partsOfSentence.add(new Word(part));
            } else if (part.matches(digitRegEx)) {
                partsOfSentence.add(new Digit(part));
            } else {
                partsOfSentence.add(new PunctuationMark(part));
            }
        }
        return partsOfSentence;
    }
}