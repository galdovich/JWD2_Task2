package com.galdovich.task2.dao.reader;

import com.galdovich.task2.dao.reader.exception.FileReaderException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomFileReader {
    private static final String SEPARATOR = "\n";

    public String readFile(Path path) throws FileReaderException {
        String result;
        try (Stream<String> stream = Files.lines(path)) {
            result = stream.collect(Collectors.joining(SEPARATOR));
            System.out.println(result);
        } catch (IOException exc) {
            throw new FileReaderException(exc);
        }
        return result;
    }
}
