package hrm_EPS_ParallelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.GenericUtils.BaseClass_HRM_EPS;

public class Class2Test extends BaseClass_HRM_EPS
{
	@Test
	public void clickOnLeave()
	{
		wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(By.xpath("//span[text()='Leave']")))).click();
		System.out.println("successfully clicked on Leave Module");
	}
	
	@Test
	public void clickOnTime()
	{
		wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(By.xpath("//span[text()='Time']")))).click();
		System.out.println("successfully clicked on Time Module");
	}
	
	@Test
	public void clickOnAdmin()
	{
		wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(By.xpath("//span[text()='Admin']")))).click();
		System.out.println("successfully clicked on Admin Module");
	}
	
	@Test
	public void pim()
	{
		wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(By.xpath("//span[text()='PIM']")))).click();
		System.out.println("successfully clicked on PIM Module");
	}
}
