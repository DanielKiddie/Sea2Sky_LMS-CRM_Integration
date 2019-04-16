package utils;

public class LineTester {

	public static void main(String[] args) {
		
		try {
			
			//Line to test here
			
			Excel excel = new Excel("C:\\\\Users\\\\Daniel - new\\\\Desktop\\\\Access_Creds.xlsx", "Sheet1");
			
			String testUsername = excel.getStringCellData(1, 0);
			
			System.out.println(testUsername);

			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

}
