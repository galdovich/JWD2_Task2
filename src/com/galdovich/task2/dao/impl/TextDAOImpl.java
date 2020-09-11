package com.galdovich.task2.dao.impl;

import com.galdovich.task2.dao.TextDAO;
import com.galdovich.task2.dao.exception.DAOException;
import com.galdovich.task2.dao.parser.ComponentParser;
import com.galdovich.task2.dao.reader.CustomFileReader;
import com.galdovich.task2.dao.reader.PathReader;
import com.galdovich.task2.dao.reader.exception.FileReaderException;
import com.galdovich.task2.entity.impl.Text;

public class TextDAOImpl implements TextDAO {

    @Override
    public Text getText() throws DAOException {
        ComponentParser componentParser = new ComponentParser();
        PathReader pathReader = new PathReader();
        CustomFileReader fileReader = new CustomFileReader();
        try {
            String text = fileReader.readFile(pathReader.getPath());
            return componentParser.createText(text);
        } catch (FileReaderException exc) {
            throw new DAOException(exc);
        }
    }
}
