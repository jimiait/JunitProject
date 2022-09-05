package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage{
	
WebDriver driver;
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement TOGGLE_ALL_UNCHECK_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='data']") WebElement SEARCH_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']") WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@id='todos-content']/form/ul/li/input") WebElement CHECKED_SINGLE_CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement REMOVE_BUTTON_ELEMENT;
	
	public void toggleAllCheck() {
		TOGGLE_ALL_CHECKBOX_ELEMENT.click();
	}
	
	public void toggleUnCheckAll() {
		TOGGLE_ALL_CHECKBOX_ELEMENT.click();
	}
	
	public void addValueInSearchBox(String value) {
		SEARCH_BOX_ELEMENT.sendKeys(value);
	}
	
	public void clickOnAddButton() {
		ADD_BUTTON_ELEMENT.click();
	}
	
	public void clickOnSingleCheckBox() {
		CHECKED_SINGLE_CHECKBOX_ELEMENT.click();
	}
	
	public void clickOnRemoveButton() {
		REMOVE_BUTTON_ELEMENT.click();
	}
	
	

}
