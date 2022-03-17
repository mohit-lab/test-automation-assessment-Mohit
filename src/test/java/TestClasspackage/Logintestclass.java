package TestClasspackage;

import Basepackage.Baseclass;
import Locators.LoginLocators;
import Utilitypackage.Utilityclass;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;

public class Logintestclass extends Baseclass {

    String sheetName = "Sheet1";
    public LoginLocators locatorobj;

    @DataProvider

    public Object[][] getlogindataIcehrm() throws IOException, InvalidFormatException {

        Object data[][] = Utilityclass.getTestData(sheetName);
        return data;
    }

    @Test(dataProvider = "getlogindataIcehrm")
    public void loginIcehrm(String username, String password) throws InterruptedException {
        locatorobj = new LoginLocators();
        locatorobj.login(username, password);
    }


}
