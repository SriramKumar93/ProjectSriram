package Hotelapp_Login;


import org.testng.Assert;
import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;
import BasePageOfCmd.dressPageObject;


public class dressPageTest {
// Dress page test case
	
	dressPageObject dresspgObj;
	HomePageObj hmg;
 
   public dressPageTest() {
	dresspgObj=new dressPageObject();
	hmg=new HomePageObj();
} 

   
   @Test
   public void verifySizelist(){
	   dresspgObj.clickTshirt();
	   dresspgObj.clickProduct();
	   Assert.assertTrue(dresspgObj.setSizeS().isDisplayed(), "Size S not Displayed");
	   Assert.assertTrue(dresspgObj.setSizeM().isDisplayed(), "Size M not display");
	   Assert.assertTrue(dresspgObj.setSizeL().isDisplayed(), "Size L not display");
	   
	
   }

	
	
	
	
	
}
