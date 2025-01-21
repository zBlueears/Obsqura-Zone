package excelreading;

import java.io.IOException;

public class ExcelMain 
{
	public static void main(String[] args) throws IOException 
	{
		String s1= Excelcode.readStringData(2,2);
		String s2=Excelcode.readIntegerValue(1,0);
		System.out.println(s1);
		System.out.println(s2);
	}

}
