package Pagepkg;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pageclass {
	WebDriver driver;
	public Pageclass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"name\"]")
    WebElement Name;
	
   @FindBy(xpath="//*[@id=\"email\"]")
    WebElement Email;
   @FindBy(xpath="//*[@id=\"phone\"]")
   WebElement Phone;
   @FindBy(xpath="//*[@id=\"textarea\"]")
   WebElement Area;
   @FindBy(xpath="//*[@id=\"female\"]")
   WebElement Female;
    @FindBy(xpath="//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[2]/label")
   WebElement Mon;
   @FindBy(xpath="//*[@id=\"friday\"]")
   WebElement Fri;
   @FindBy(xpath="//*[@id=\"country\"]")
   WebElement Country;
   @FindBy(xpath="//*[@id=\"colors\"]/option[6]")
   WebElement White;
   @FindBy(xpath="//*[@id=\"animals\"]/option[3]")
   WebElement Ani;
 @FindBy(xpath="//*[@id=\"alertBtn\"]")
   WebElement Alert1;
 @FindBy(xpath="//*[@id=\"HTML4\"]/div[1]/button")
 WebElement New;
 @FindBy(id="datepicker")
 WebElement Date;
 

 
   
   
   public void Setuser(String user)
   {
	 Name.sendKeys(user);  
   }
   public void SetEmail(String mail)
   {
	   Email.sendKeys(mail);
   }
   public void Contact(String num)
   {
	   Phone.sendKeys(num);
   }
   public void Address(String Adr)
   {
	   Area.sendKeys(Adr);
   }
   public void gender()
   {
	   Female.click();
   }
   public void Day()
   {
	   Mon.click();
	   Fri.click();
   }
   
   public void Cty()
   {
	   Select sel=new Select(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[5]/select")));
	   sel.selectByVisibleText("India");
   }
   public void Color()
   {
	   White.click();
   }
   
   public void Animal()
   {
	 Ani.click();;
   }
   public void alerttext()
   {
	   Alert1.click();
	 Alert alert = driver.switchTo().alert(); // switch to alert

	 
	  
	  alert.accept();// capture alert message
	
   }
   public void NewTab() throws InterruptedException      //windowhandle
   {
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	  String parentwindow =driver.getWindowHandle() ;
	  Set<String> allwindowhandles=driver.getWindowHandles();
	  for(String handle:allwindowhandles) {
		  if(!handle.equalsIgnoreCase(parentwindow)) {
			  driver.switchTo().window(handle);
			  //driver.close();
			  driver.switchTo().window(parentwindow);
		  }
	  } 
   }
	  
	  public void datepick()
	  {
		
		 Date.sendKeys("2024-11-13");
		 

	  }
	 
   
   
   
   
}
   
   
   

