package Desarrollo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.AbstractPageObject;


public class Inicio extends AbstractPageObject{
	
	public Inicio(WebDriver driver, WebDriverWait driverWait){
        super(driver, driverWait);
     }

	JavascriptExecutor js = (JavascriptExecutor) driver;

	WebDriverWait wait = new WebDriverWait(driver, 30);
	private static final TimeUnit SECONDS = null;

	
			// hola
	public void CrearCuenta(){
		
		//WebElements
		WebElement AccountMS = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
		
		driver.get("http://sdetuniversity.com/projects/");
		AccountMS.click();
		
	} 
	
}