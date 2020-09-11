package com.galdovich.task2.dao.parser;

import com.galdovich.task2.entity.Component;
import com.galdovich.task2.entity.impl.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {
    private final String smallTextBlock = "(.{10}(.*?\\n*?)+?[:.!?]\\s?)";
    private final String sentenceRegEx = "(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)";
    private final PartOfSentenceParser partOfSentenceParser = new PartOfSentenceParser();
    private final Pattern smallTextBlockPattern = Pattern.compile(smallTextBlock);
    private final Pattern sentencePattern = Pattern.compile(sentenceRegEx);

    public List<Component> parseSentences(String textBlock) {
        List<Component> sentences = new ArrayList<>();
        Matcher smallTextBlockMatcher = smallTextBlockPattern.matcher(textBlock);
        while (smallTextBlockMatcher.find()) {
            Matcher sentenceMatcher = sentencePattern.matcher(smallTextBlockMatcher.group());
            while (sentenceMatcher.find()) {
                Sentence sentenceEntity = new Sentence();
                String sentence = sentenceMatcher.group();
                List<Component> partsOfSentence = partOfSentenceParser.parsePartOfSentence(sentence);
                for (Component c : partsOfSentence) {
                    sentenceEntity.addPart(c);
                }
                sentences.add(sentenceEntity);
            }
        }
        return sentences;
    }
}