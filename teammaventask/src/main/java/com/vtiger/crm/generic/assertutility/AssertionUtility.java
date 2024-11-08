package com.vtiger.crm.generic.assertutility;

import org.testng.asserts.SoftAssert;

public class AssertionUtility {
public void softAssertEquals(String value1,String value2) {
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(value1, value2);
	
}

public void softAssertFalse(String value1,String value2) {
	SoftAssert soft=new SoftAssert();
	
}
}
