package Hotelapp_Login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePageOfCmd.dressPageObject;


public class dressPageTest {
// Dress page test case
	
	dressPageObject dresspgObj;
 
   public dressPageTest() {
	dresspgObj=new dressPageObject();
} 

   
   @Test
   public void verifySizelist(){
	   dresspgObj.clickTshirt();
	   dresspgObj.T_ShritDisplay();
	   Assert.assertTrue(dresspgObj.setSizeS().isDisplayed(), "Size S not Displayed");
	   Assert.assertTrue(dresspgObj.setSizeM().isDisplayed(), "Size M not display");
	   Assert.assertTrue(dresspgObj.setSizeL().isDisplayed(), "Size L not display");
	   
	
   }

	
	
	
	
	
}
