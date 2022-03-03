package Utilitypackage;

import Basepackage.Baseclass;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utilityclass extends Baseclass {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static Object[][] getTestData(String sheetName) throws IOException, InvalidFormatException {

        FileInputStream file = null;
        file = new FileInputStream("C:\\Users\\mohitbisen\\IdeaProjects\\Icehrmassignment\\Datafile.xlsx");

        workbook = XSSFWorkbookFactory.createWorkbook(OPCPackage.open(file));
        sheet = workbook.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k<sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();

            }
        }
        System.out.println("user data is" + data);
        return data;

    }
}
