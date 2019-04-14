package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
//	static String systemPath = System.getProperty("user.dir");
	
	
	public static String getTestUserNameFromExcel() {
		
		String testUserName = null;

		try {
			
			workbook = new XSSFWorkbook("C:\\Users\\Daniel - new\\Desktop\\Poludo Institute\\Selenium\\Automation2018\\excel\\Access_Creds.xlsx");
			workbook.getSheet("Sheet1");
			
			testUserName = sheet.getRow(1).getCell(0).getStringCellValue();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
		return testUserName;
		
		
	}
	
	

	
	
	
}
