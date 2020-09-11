package com.galdovich.task2.dao.reader.exception;

public class FileReaderException extends Exception {
    public FileReaderException() {
        super();
    }

    public FileReaderException(String message) {
        super(message);
    }

    public FileReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileReaderException(Throwable cause) {
        super(cause);
    }
}
