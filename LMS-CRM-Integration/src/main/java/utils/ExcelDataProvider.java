package utils;

public class ExcelDataProvider {
	
	
	public void testData(String excelPath, String sheetName) {
		
		Excel excel = new Excel(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int columnCount = excel.getcolumnCount();
		
		
		
	}
	

}
