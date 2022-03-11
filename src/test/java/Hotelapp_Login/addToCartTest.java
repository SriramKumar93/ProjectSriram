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
/*	@BeforeMethod
public void goToProductpage(){
		hmg.clickDress();
	}*/
	
	@Test
	public void AddtoCatd(){
		hmg.clickDress();
		addTo.clickProdcut();
		addTo.clickaddToCart();
		System.out.println(addTo.productName());
		System.out.println(addTo.CartAddedName());
		
		Assert.assertTrue(addTo.productName().equals(addTo.CartAddedName()), "Cart Added Product is wrong");
	}
	
	
}
