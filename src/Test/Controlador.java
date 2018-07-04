package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Controlador {

	// CREAR CUENTA EN SDETU
    
	public void cCreaCuenta(){
	LoginTest sdetu = new LoginTest();
	sdetu.tCrearCuenta();
	}
  
        
}
