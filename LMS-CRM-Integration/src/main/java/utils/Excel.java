package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
	* A class and methods that handle operations related to reading from Excel files using Apache POI.
	*/

public class Excel {
	
//	public static String excelFilePath;
//	//= "C:\\Users\\Daniel - new\\Desktop\\Access_Creds.xlsx";
//	public static String sheetName;
	//= "Sheet1";
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
//	static String systemPath = System.getProperty("user.dir");
		
	public Excel(String excelPath, String sheetName) {
			
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	/**
     * Gets Excel file's number of records.
     *
     * @return int 
     * the number of records
     */
	
	public static int getRowCount() {
		
		int rowCount = 0;

		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return rowCount;
		
	}
	/**
     * Gets Excel file's number of columns.
     *
     * @return int 
     * the number of columns
     */
	
	public static int getColumnCount() {
		
		int columnCount = 0;

		try {
			
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return columnCount;
		
	}

	/**
     * Gets the String content of a specific cell in an Excel File. 
     *
     * @param rowNumber the number indicating which record to draw from (zero indexed)
	 *
	 * @param colNumber the number indicating which column to draw from (zero indexed)
     *
     * @return String 
     * cell content
     */
	
	public String getStringCellData(int rowNumber, int colNumber) {
		
		String cellData = null;

		try {
			
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return cellData;
		
	}
	
	/**
     * Gets the double content of a specific cell in an Excel File. 
     *
     * @param rowNumber the number indicating which record to draw from (zero indexed)
	 *
	 * @param colNumber the number indicating which column to draw from (zero indexed)
     *
     * @return double 
     * cell content
     */
	
	public static double getDoubleCellData(int rowNumber, int colNumber) {
		
		double cellData = 0;

		try {
			
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return cellData;
		
	}
	
}
