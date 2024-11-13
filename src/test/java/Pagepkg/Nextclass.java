package Pagepkg;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nextclass {
WebDriver driver;
public Nextclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@class='dropbtn']")
WebElement Mouse ;
@FindBy(xpath="//a[text()='Mobiles']")
WebElement mobiles;
@FindBy(xpath="//*[@id=\"HTML10\"]/div[1]/button")
WebElement Field2 ;
@FindBy(id="draggable")
WebElement drag;
@FindBy(id="droppable")
WebElement drop;
@FindBy(xpath="//*[@id=\"slider-range\"]/span[2]")
WebElement slideR;
@FindBy(xpath="//*[@id=\"slider-range\"]/span[1]")
WebElement slideL;

@FindBy(id="comboBox")
WebElement box;
@FindBy(xpath="//*[@id=\"dropdown\"]/div[7]")
WebElement ele7;
@FindBy(id="lenovo")
WebElement link;
@FindBy(id="dropdown")
WebElement Move;




public void hover()
{
	   Actions act=new Actions(driver);
	   act.moveToElement(Mouse).perform();
	   act.moveToElement(mobiles).click().perform();
			  			   
}
public void doubleck()
{
	Actions act1=new Actions(driver);
	act1.doubleClick(Field2).perform();
	
}
public void DD()
{
	Actions act2=new Actions(driver);
	act2.dragAndDrop(drag, drop).perform();
	
}
public void slider()
{
	Actions act3=new Actions(driver);
	
	act3.dragAndDropBy(slideL, -20, 0).perform();
	Actions act4=new Actions(driver);
	act4.dragAndDropBy(slideR, 200, 0).perform();
}
public void scroll()
{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 box.click();
	 Move.click();
	 WebElement ele7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown-menu")));
	 ele7.click();
	 
	 
}
public void LinkHandle() throws InterruptedException
{
	link.click();
	Thread.sleep(4000);
	driver.navigate().back();
	// String linkUrl = link.getAttribute("href");
  //   System.out.println("Link URL: " + linkUrl);
  
    // Set<String> windowHandles = driver.getWindowHandles();
    // Iterator<String> iterator = windowHandles.iterator();
    // String firstWindow = iterator.next();  // First window handle
   //  String secondWindow = iterator.next();
   //  driver.switchTo().window(firstWindow);


}
}//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



