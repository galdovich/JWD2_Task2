package com.galdovich.task2.dao;

import com.galdovich.task2.dao.impl.TextDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private static TextDAO textDAO = new TextDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public TextDAO getTextDAO() {
        return textDAO;
    }
}
