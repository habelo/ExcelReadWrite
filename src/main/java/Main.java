import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            QuestionHandler handler = new QuestionHandler();
            handler.insertQuestions();
            handler.askQuestions();
            handler.writeQuestions();
//             FileInputStream file;
//             Workbook workbook;
//             Sheet sheet;
//             List<Cell> questions;
//             DataFormatter formatter;
//                file = new FileInputStream(new File("C:\\Users\\MaybeNull\\Desktop\\julaExcel\\00Master.xlsx"));
//                workbook = new XSSFWorkbook(file);
//                sheet = workbook.getSheetAt(0);
//                questions = new ArrayList<>();
//                formatter = new DataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
