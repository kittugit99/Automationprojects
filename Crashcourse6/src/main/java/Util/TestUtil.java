package Util;

import java.util.ArrayList;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getexceldata() {
	
	ArrayList<Object[]> mydata = new ArrayList<Object[]>();
	try {
	reader = new Xls_Reader("C:\\Users\\Krishna\\eclipse-workspace\\Crashcourse6\\src\\main\\java\\Excel_data\\Book1.xlsx");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	for(int rowNum = 2; rowNum <=reader.getRowCount("Userdata"); rowNum++) {
	String email = reader.getCellData("Userdata", "email", rowNum);
	String password = reader.getCellData("Userdata", "password", rowNum);
	Object ob[] = {email, password};
	mydata.add(ob);
	
	}
	return mydata;
	}
}
