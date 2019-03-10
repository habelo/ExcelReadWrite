import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelHandler {

    private static  ExcelHandler instance = null;
    private  final FileInputStream file;
    private  final Workbook workbook;
    private  final Sheet sheet;
    private  final List<Cell> questions;
    private  final DataFormatter formatter;

    private ExcelHandler() throws IOException {
        this.file = new FileInputStream(new File("C:\\Users\\MaybeNull\\Desktop\\julaExcel\\00Master.xlsx"));
        this.workbook = new XSSFWorkbook(file);
        this.sheet = workbook.getSheetAt(0);
        this.questions = new ArrayList<>();
        this.formatter = new DataFormatter();
    }

    public static ExcelHandler getInstance() throws IOException {
        return instance==null?new ExcelHandler(): instance;
    }

    public String getContent(char letter, int number){
        System.out.println(""+letter+number);
        CellReference cr = new CellReference(""+letter+number);
        Row row = sheet.getRow(cr.getRow());
        Cell cell = row.getCell(cr.getCol());
//        StringBuilder sb = new StringBuilder();
//        sb.append(cell.getCellFormula());
//        sb.replace(5, 10, ""+questionLetter+functionNumber+functionChar);
//        return cell.getCellFormula();
        return cell.getStringCellValue();
    }

}
