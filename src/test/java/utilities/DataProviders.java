package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	    //Dataprovider1
		@DataProvider(name="LoginData")
		public String[][] getData() throws IOException {
			
			String path=".\\testData\\email.xlsx";
			
			ExcelUtility xlutil=new ExcelUtility(path);
			
			int rownum=xlutil.getRowCount("Sheet1");
			int colnum=xlutil.getCellCount("Sheet1", 1);
			
			String logindata[][]=new String[rownum][colnum];
			
			for(int i=1;i<=rownum;i++) {
				for(int j=0;j<colnum;j++) {
					logindata[i-1][j]=xlutil.getCellData("Sheet1",i,j);
				}
			}
			
			return logindata;
			
		}

	}



