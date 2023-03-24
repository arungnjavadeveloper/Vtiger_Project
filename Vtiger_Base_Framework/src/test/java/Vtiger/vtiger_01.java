package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.DocumentPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class vtiger_01 extends Base_Test {
	
	String expectedPageTitle="Administrator - Documents - vtiger CRM 5 - Commercial Open Source CRM";
	@Test
	public void toClickOnDocument() {
		
		DocumentPage docPage=new DocumentPage(driver);
		docPage.getDocumentLink().click();
		Assert.assertEquals(driver.getTitle(), expectedPageTitle, "Documents page is not displayed");
		Reporter.log("Documents page is displayed", true);
	}
}
