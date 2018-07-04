package Test;



import Desarrollo.Inicio;


public class LoginTest extends BaseTest{
     	public LoginTest(){
		super.setup();
	    }
	
    
	public void tCrearCuenta() {
        Inicio inicio = new Inicio(driver, driverWait);
        inicio.CrearCuenta();
        }
	
}

