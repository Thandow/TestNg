package com.OHRM.TestScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OHRM.lib.LoginKeywords;

public class OHRMLoginTest {
	
	public void TestInOHRMLogin() throws IOException, InterruptedException {
		
		LoginKeywords lkw = new LoginKeywords();
		
		FileInputStream fi = new FileInputStream("./Keywords\\ActionsKeywords.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rows = ws.getLastRowNum();
		for (int i=1; i <= rows; i++) {
			//To read num rows
			String runMode=ws.getRow(i).getCell(4).toString();
			if (runMode.equalsIgnoreCase("Yes")) {
				//To read Step Description
				String stepDesc=ws.getRow(i).getCell(2).toString();
				switch(stepDesc) 
				{
				case "Launch Browser":
					lkw.launchBrowser();
					break;
				case "Navigate to URL":
					lkw.navigateURL();
					break;
				case "Enter the Username":
					lkw.enterUsername();
					break;
				case "Enter the Password":
					lkw.enterPassword();
					break;
				case "click on Login button":
					lkw.clickLogin();
					
				}
		}
		}
		
	}

}
