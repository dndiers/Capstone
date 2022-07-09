package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bookingPage {
	
	private By qty = By.xpath("//td[3]/input");
	private By checkoutbtn = By.xpath("//input[2]");
	
	
	
	private WebDriver driver;
	
	public bookingPagePage(WebDriver driver)
	{
		this.driver = driver;
		if ( !driver.getTitle().trim().equals("Book Stay"))
		{
			throw new IllegalStateException("This is not sign in page, current page is: "
                    +driver.getCurrentUrl());
		}
	}
	
	public reservationDetailsPage proceedToCheckout()
	{
		driver.findElement(qty).sendKeys("1");;
		driver.findElement(checkoutbtn).click();
		return new reservationDetailsPage(driver);
		
		
	}

}
