import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestGoogleWebsite {

	@Test
	void test01() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canonc");
        ageInput.sendKeys("2");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("johnjohn", result);
        driver.close();
	}
	
	@Test
	void test02() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnj");
        lastNameInput.sendKeys("canoncanoncano");
        ageInput.sendKeys("149");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnj", result);
        driver.close();
	}
	
	@Test
	void test03() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjo");
        lastNameInput.sendKeys("canoncanoncanon");
        ageInput.sendKeys("150");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("johnjo", result);
        driver.close();
	}
	
	@Test
	void test04() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnjohnjohnjo");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnjohnjohnjo", result);
        driver.close();
	}
	
	@Test
	void test05() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjoh");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("johnjohnjohnjoh", result);
        driver.close();
	}
	
	@Test
	void test06() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
	
	@Disabled
	void test07() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
	
	@Test
	void test08() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("cano");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
	
	@Disabled
	void test09() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncanoncanonc");
        ageInput.sendKeys("75");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
	
	void test10() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("0");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
	
	void test11() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("151");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
}
