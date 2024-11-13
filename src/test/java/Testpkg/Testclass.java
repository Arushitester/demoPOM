package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Nextclass;
import Pagepkg.Pageclass;

public class Testclass extends Baseclass{
	@Test(priority=1)
	public void testlog() throws InterruptedException
	{
		
	Pageclass pg=new Pageclass(driver);
	pg.Setuser("Arsh");
	pg.SetEmail("arush@gmail.com");
	pg.Contact("9789634243");
	pg.Address("kaniyapuram");
	pg.gender();
	pg.Day();
	pg.Cty();
	pg.Color();
	pg.Animal();
	Thread.sleep(2000);
	pg.alerttext();
	pg.NewTab();
	pg.datepick();
	}
	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		Nextclass nc=new Nextclass(driver);
		nc.hover();
		nc.doubleck();
		nc.DD();
		Thread.sleep(4000);
		nc.slider();
		
		nc.LinkHandle();
		nc.scroll();
	
	
	

	}
	

}
