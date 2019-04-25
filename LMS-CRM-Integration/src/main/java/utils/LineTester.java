package utils;

public class LineTester {

	public static void main(String[] args) {
		
		try {
			
			//Line to test here
			
			String excelPath = "C:\\Users\\Daniel - new\\Desktop\\Poludo Institute\\Personal Github Repos 2019 onward\\Sea2Sky_LMS-CRM_Integration\\LMS-CRM-Integration\\excel\\MOCK_DATA.xlsx";
			

			ExcelDataProvider.testData(excelPath, "data");
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

}
