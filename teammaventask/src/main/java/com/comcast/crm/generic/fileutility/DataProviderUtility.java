package com.comcast.crm.generic.fileutility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	@DataProvider
	public Object[][] createOrg() throws Throwable {
		ExcelUtility eLib=new ExcelUtility();
		int rowCount = eLib.getRowCount("Sheet3");
				System.out.println(rowCount);
		Object[][] objArr = new Object[rowCount][1];
		
		for(int i=0;i<rowCount;i++) {
			objArr[i][0] = eLib.getDataFromExcel("Sheet3", i+1, 0);
			
		}
		return objArr;	


}
}