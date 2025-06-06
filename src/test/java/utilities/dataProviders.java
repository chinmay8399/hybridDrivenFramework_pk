package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataProviders {
	
	//dataProvider method 1 for loginData excel
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		//this is the excel path
		//-->System.getProperty("user.dir") and .// works the same
		String path="C:\\Users\\chinm\\eclipse-workspace\\hybridDrivenFramework_pk\\testData\\Opencart_LoginData.xlsx";
		
		//creating object of excel data reading class-->ExcelUtility
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalRows=xlutil.getRowCount("sheet1");
		int totalCols=xlutil.getCellCount("sheet1",1);
		
		String logIn[][]=new String[totalRows][totalCols];
		
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalCols;j++) {
				logIn[i-1][j]=xlutil.getCellData("sheet1", i, j);
			}
		}
		return logIn;
		
	}
	
	//dataProvider method 2 for some other excel utility file

	//dataProvider method 3 for some other excel utility file

	//dataProvider method 4 for some other excel utility file

}
