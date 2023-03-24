package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.DocumentPage;

public class vtiger_02 extends Base_Test{
	
	public void toClickOnDeleteIcon() {
		DocumentPage docPage=new DocumentPage(driver);
		docPage.getDocumentLink().click();
		docPage.getDeleteButton().click();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		
	}

}
