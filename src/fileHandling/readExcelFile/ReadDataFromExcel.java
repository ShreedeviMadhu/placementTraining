package fileHandling.readExcelFile;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

// xls or xlsx DDT BDD - Behaviour Driven Development (Cucumber Plugin)
public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\resources\\ExcelData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Info");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        for (int i=1; i<=rowCount; i++){  // Starting from row 1 --skipping the header
            XSSFRow currentRow = sheet.getRow(i);
            for (int j=0; j<columnCount;j++){
                String cellValue = currentRow.getCell(j).toString();
                System.out.println("\t\t" + cellValue);
            }
        }
        workbook.close();
    }
}
