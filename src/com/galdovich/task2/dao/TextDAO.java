package com.galdovich.task2.dao;

import com.galdovich.task2.dao.exception.DAOException;
import com.galdovich.task2.entity.impl.Text;

public interface TextDAO {

    Text getText() throws DAOException;
}
