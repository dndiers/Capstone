package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bookingReportPage {
	
	private By logout = By.linkText("LogOut");
	private By orderno = By.xpath("/html/body/form/font[2]/table/tbody/tr[1]/td[2]/label");
	
	private WebDriver driver;
	
	public bookingReportPage(WebDriver driver)
	{
		this.driver = driver;
		if ( !driver.getTitle().equals("Booking Confirmation"))
		{
			throw new IllegalStateException("This is not sign in page, current page is: "
                    +driver.getCurrentUrl());
		}
	}
	
	public String bookingConfirmation()
	{
		return driver.findElement(bookingno).getText();
		
		
	}
	public loginPage logout()
	{
		driver.findElement(logout).click();
		return new loginPage(driver);
		
		
	}

}
