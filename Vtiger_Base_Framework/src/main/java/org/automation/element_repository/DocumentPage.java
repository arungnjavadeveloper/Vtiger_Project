package org.automation.element_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPage {
	
	WebDriver driver;
	public DocumentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(linkText = "Documents")
	private WebElement documentLink;
	
	@FindBy(xpath = "//img[@title='Create Document...']")
	private WebElement createDocumentIcon;
	
	@FindBy(xpath = "//img[@title='Search in Documents...']")
	private WebElement searchDocumentIcon;
	
	@FindBy(xpath="//img[@title='Open Calendar...']")
	private WebElement openCalendar;
	
	@FindBy(xpath= "//img[@title='Show World Clock...']")
	private WebElement showWorldClock;
	
	@FindBy(xpath= "//img[@title='Open Calculator...']")
	private WebElement openCalculator;
	
	@FindBy(xpath= "//img[@title='Chat...']")
	private WebElement chat;
	
	@FindBy(xpath= "//img[@title='Last Viewed']")
	private WebElement lastViewed;
	
	@FindBy(name = "delete")
	private WebElement deleteButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getDocumentLink() {
		return documentLink;
	}

	public WebElement getCreateDocumentIcon() {
		return createDocumentIcon;
	}

	public WebElement getSearchDocumentIcon() {
		return searchDocumentIcon;
	}

	public WebElement getOpenCalendar() {
		return openCalendar;
	}

	public WebElement getShowWorldClock() {
		return showWorldClock;
	}

	public WebElement getOpenCalculator() {
		return openCalculator;
	}

	public WebElement getChat() {
		return chat;
	}

	public WebElement getLastViewed() {
		return lastViewed;
	}
}
