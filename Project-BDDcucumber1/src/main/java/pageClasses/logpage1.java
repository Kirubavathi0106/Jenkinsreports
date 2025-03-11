//package pageClasses;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import Utility.Base;
//
//public class logpage1 extends Base {
//public static Base base;
//	
//	By signinLink = By.linkText("Sign in"); 
//	By username = By.id("login1");
//	By password = By.id("password");
//	By clickSignin = By.className("signinbtn");
//	
//	public void signinLink() {
//		base.driver.findElement(signinLink).click();
//		//driver.findElement(signinLink).click();
//	}
//	
//	public void getLogin(String user , String pass)
//	{
//		WebElement unm = driver.findElement(username);
//		unm.sendKeys(user);
//		WebElement pwd = driver.findElement(password);
//		pwd.sendKeys(pass);
//	}
//	
//	public void SignIn() {
//		base.driver.findElement(clickSignin).click();
//		//driver.findElement(signinLink).click();
//	}
//}
//
//
//
