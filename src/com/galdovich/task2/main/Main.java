package com.galdovich.task2.main;

import com.galdovich.task2.dao.DAOFactory;
import com.galdovich.task2.dao.TextDAO;
import com.galdovich.task2.entity.impl.Text;
import com.galdovich.task2.service.impl.TextService;
import com.galdovich.task2.service.impl.impl.TextServiceImpl;
import com.galdovich.task2.view.PrintComponent;

public class Main {

    public static void main(String[] args) throws Exception {

        PrintComponent printComponent = new PrintComponent();
        DAOFactory daoFactory = DAOFactory.getInstance();
        TextDAO textDAO = daoFactory.getTextDAO();
        TextService textService = new TextServiceImpl();

        Text text = textDAO.getText();

        // Output of the collected text
        System.out.println("----------------------------------- Output of the collected text -----------------------------------");
        printComponent.print(text.getText());
        System.out.println();

        // Task 2 - (Вывод всех предложений в порядке возрастания количества слов)
        System.out.println("----------------------------------- Task 2 (Вывод всех предложений в порядке возрастания количества слов) -----------------------------------");
        printComponent.print(textService.formSentencesAscending(text));
        System.out.println();

        // Task 5 - (Вывод всех предложений с заменой мест первого и последнего слова)
        System.out.println("----------------------------------- Task 5 (Вывод всех предложений с заменой мест первого и последнего слова) -----------------------------------");
        printComponent.print(textService.formSentenceOppositeReplacementFirstLastWords(text));
        System.out.println();

        // Task 9 - (Вывод всех слов с сортировкой по букве)
        System.out.println("----------------------------------- Task 9 (Вывод всех слов с сортировкой по букве) -----------------------------------");
        printComponent.print(textService.formSortedWordsByLetter(text, "p"));
        System.out.println();

    }
}
