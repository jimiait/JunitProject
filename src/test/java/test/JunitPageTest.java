package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.BasePage;
import page.TestPage;
import util.BrowserFactory;

public class JunitPageTest  extends BasePage{
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();

		
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		
		testPage.addValueInSearchBox("Tagore" + generateRandomNo(999));
		testPage.clickOnAddButton();
		testPage.addValueInSearchBox("Tagore" + generateRandomNo(999));
		testPage.clickOnAddButton();
		testPage.addValueInSearchBox("Tagore" + generateRandomNo(999));
		testPage.clickOnAddButton();
		testPage.addValueInSearchBox("Tagore" + generateRandomNo(999));
		testPage.clickOnAddButton();
		testPage.addValueInSearchBox("Tagore" + generateRandomNo(999));
		testPage.clickOnAddButton();
		testPage.toggleAllCheck();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testPage.toggleUnCheckAll();
		testPage.clickOnSingleCheckBox();
		testPage.clickOnRemoveButton();
		testPage.toggleAllCheck();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		testPage.clickOnRemoveButton();
		BrowserFactory.tearDown();
	}

}
