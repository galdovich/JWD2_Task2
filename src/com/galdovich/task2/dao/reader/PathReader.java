package com.galdovich.task2.dao.reader;

import com.galdovich.task2.dao.reader.exception.FileReaderException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PathReader {
    private static final String PROPERTY = "resources/property/fileProperties";
    private static final String FILE_NAME_FIELD = "fileName";
    private static final String FILE_PATH_FIELD = "filePath";

    public Path getPath() throws FileReaderException {
        try {
            Path path;
            ResourceBundle resourceBundle = ResourceBundle.getBundle(PROPERTY);
            String fileName = resourceBundle.getString(FILE_NAME_FIELD);
            String filePath = resourceBundle.getString(FILE_PATH_FIELD);
            if (Files.exists(Paths.get(filePath, fileName))) {
                path = Paths.get(filePath, fileName);
                return path;
            } else {
                throw new FileReaderException("File doesn't exist.");
            }
        } catch (MissingResourceException exc) {
            throw new FileReaderException("Properties file problem", exc);
        }
    }
}