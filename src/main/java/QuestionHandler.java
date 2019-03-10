import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class QuestionHandler {

    private final static Set<String> questions = new HashSet<>();
    private final ExcelHandler excelHandler = ExcelHandler.getInstance();

    public QuestionHandler() throws IOException {
    }


    public void insertQuestions() {

        char column = 'I';
        int questionNumber = 0;

        for(char rowLetter = 'I'; rowLetter <= 'Z'; rowLetter++) {
                for (int columnNumber = questionNumber+3; columnNumber <= 41; columnNumber++) {
                    questions.add(excelHandler.getContent(rowLetter, columnNumber));
                }
            rowLetter++;
                questionNumber++;
        }
        questions.forEach(System.out::println);
    }

    public void askQuestions() {
    }

    public void writeQuestions() {
    }
}
