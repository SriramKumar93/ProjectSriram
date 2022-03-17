package Hotelapp_Login;


import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;



public class HomePageTest {
	
	HomePageObj homepgObj;
	
	public HomePageTest(){	
	homepgObj=new HomePageObj();
	}
	
	@Test
	public void getTabDispaly(){
		Assert.assertTrue(homepgObj.womenTabdisplay().isDisplayed());
		Assert.assertTrue(homepgObj.DressTabDisplay().isDisplayed());
		Assert.assertTrue(homepgObj.T_ShritDisplay().isDisplayed());
	}
	
	@Test
	public void TabVerification(){
		homepgObj.clickwoman();
		String title = homepgObj.getTitlte();
		Assert.assertTrue(title.contains("Women"));
		
	/*	homepgObj.clickwoman();
		Assert.assertTrue(homepgObj.getTitlte().contains("women"));*/
			
		homepgObj.clickDress();
		Assert.assertTrue(homepgObj.getTitlte().contains("Dress"));
		homepgObj.clickTshirt();
		Assert.assertTrue(homepgObj.getTitlte().contains("T-shirt"));
	}

	
	@Test
	public void getSubcritionMsg(){
		int value=new Random().nextInt(50000);
	String	mailID="Sriram"+value+"@gmail.com";
		homepgObj.setEmailID(mailID);
		homepgObj.clickNewsletter();
		Assert.assertTrue(homepgObj.getMsgofsubcrib().contains("Newsletter : You have successfully"));
		
	}
	
	
	
	
	
}
