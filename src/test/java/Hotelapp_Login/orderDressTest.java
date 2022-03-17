package Hotelapp_Login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;
import BasePageOfCmd.orderDress;

public class orderDressTest {

	orderDress ordDress;
	HomePageObj hmgObj;
	
	public orderDressTest(){
		ordDress=new orderDress();
		hmgObj= new HomePageObj();
	}
	
	@BeforeMethod
	public void gotoDressPage(){
		hmgObj.clickDress();	
	}
	
	@Test
	public void dressOrdered(){
		ordDress.clickDressName();
		
		Assert.assertTrue(ordDress.btnMinus().isDisplayed(), "- btn not displayed");
		Assert.assertTrue(ordDress.btnPlus().isDisplayed(), "+ btn not displayed");
		ordDress.dressSize();
		ordDress.btnDressQtyPlusClick();
		ordDress.btnAddToCartClick();
		ordDress.btnProceedClick();
		String itemName=ordDress.productTitle().getText();
		Assert.assertTrue(itemName.equals("Printed Chiffon Dress"), "odered dress is same");
		ordDress.btnproceed2Click();
		ordDress.login();
		ordDress.btnProceed3();
		ordDress.btnCheckBoxClick();
		ordDress.btnClickProceedCarrier();
		ordDress.btnPayment();
		ordDress.btnOrderConfirmClick();
		Assert.assertTrue(ordDress.txtSucessMsg().equals("Your order on My Store is complete."), "Your Order Is Confirmed");
		
	}
	
	
}
