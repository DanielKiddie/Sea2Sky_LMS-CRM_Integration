package utils;

public class ExcelDataProvider {
	
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
		Excel excel = new Excel(excelPath, sheetName);
		
		int rowCount = Excel.getRowCount();
		int columnCount = Excel.getColumnCount();
		
		//rowCount is subtracted by one to account for header row
		Object data[][] = new Object[rowCount-1][columnCount];
		
		
		//i is 1 to avoid using header row in excel data file
		for (int i=1; i<rowCount; i++) {
			
			for (int j=0; j<columnCount; j++) {
				String cellData = excel.getStringCellData(i, j);
				
				data[i-1][j] = cellData;
				//System.out.println(cellData);
			}
		}
		return data;
		
		
	}
	

}
