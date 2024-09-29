package datadriven;

import Util.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader("C:/Users/Krishna/eclipse-workspace/Crashcourse5/src/main/java/Data/Book1.xlsx");
		int columncount = reader.getColumnCount("Userdata");
		System.out.println("No of columns in the sheet: " +columncount);
		
		
	}

}
