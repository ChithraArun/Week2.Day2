package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");

WebElement username = driver.findElement(By.id("username"));
username.sendKeys("Demosalesmanager");

WebElement password=driver.findElement(By.id("password"));
password.sendKeys("crmsfa");

WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
loginButton.click();

WebElement crmLogin = driver.findElement(By.linkText("CRM/SFA"));
crmLogin.click();

WebElement leadsLink = driver.findElement(By.linkText("Leads"));
leadsLink.click();

WebElement createLead = driver.findElement(By.linkText("Create Lead"));
createLead.click();

WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
companyName.sendKeys("Testleaf");

WebElement fName = driver.findElement(By.id("createLeadForm_firstName"));
fName.sendKeys("Test");

WebElement lName = driver.findElement(By.id("createLeadForm_lastName"));
lName.sendKeys("Leaf");

WebElement fNameLocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
fNameLocal.sendKeys("test");

WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
department.sendKeys("ComputerScience");

WebElement description = driver.findElement(By.id("createLeadForm_description"));
description.sendKeys("MyFirstSeleniumCode");

WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
email.sendKeys("xxx@gmail.com");

WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select s1 = new Select(stateProvince);

s1.selectByVisibleText("New York");

WebElement createButton = driver.findElement(By.className("smallSubmit"));
createButton.click();

String title = driver.getTitle();
System.out.println(title);
if(title.equalsIgnoreCase("View Lead | opentaps CRM")) {
	System.out.println("Test Passed");
}
driver.close();
	}
}
