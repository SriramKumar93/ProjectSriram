package Hotelapp_Login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;
import BasePageOfCmd.addToCart;

public class addToCartTest {
	
	addToCart addTo;
	HomePageObj hmg;
	
	
 public addToCartTest() {
	addTo=new addToCart();
	hmg=new HomePageObj();
}
   @BeforeMethod
public void goToProductpage(){
		hmg.clickDress();
	}
	
	@Test
	public void AddtoCatd(){
		
		addTo.mouseMove();
		String prodName=addTo.itemName();
		addTo.clickaddToCart();
		addTo.btnClickProcessToCartUsingJS();
		String addedName=addTo.addedPartName();
		System.out.println(prodName);
		System.out.println(addedName);
		
		Assert.assertTrue(prodName.equals(addedName), "Cart Added Product is wrong");
	}
	
	
}
