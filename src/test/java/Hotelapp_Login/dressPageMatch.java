package Hotelapp_Login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;
import BasePageOfCmd.dressPageResptiveMatch;
import graphql.Assert;
import graphql.PublicApi;
// Dress page testing-Match peoduct
public class dressPageMatch {

	dressPageResptiveMatch dressPgMatchObj;
	HomePageObj homepgObj;
int a = 15;
	
	
	 public dressPageMatch() {
			dressPgMatchObj=new dressPageResptiveMatch();
			 homepgObj=new HomePageObj();
		}
	
	@Test
	 public void VerifyProductCountMatch(){
		homepgObj.clickwoman();
		int actual=dressPgMatchObj.getProductCount();
		int Expet=dressPgMatchObj.getTotalProdcutCount();
		
		
		Assert.assertTrue(actual==Expet);
		
	}
	 
	 
	 	
	
}
