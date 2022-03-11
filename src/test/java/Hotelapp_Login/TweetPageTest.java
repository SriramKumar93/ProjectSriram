package Hotelapp_Login;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePageOfCmd.HomePageObj;
import BasePageOfCmd.tweet_Facechecked;


public class TweetPageTest {

	tweet_Facechecked tweetpageobj;
	HomePageObj homepgObj;
	
	public  TweetPageTest() {
		tweetpageobj=new tweet_Facechecked();
		homepgObj=new HomePageObj();
	}
	
	@Test
	public void btnVerifyTweet(){
		homepgObj.clickDress();
		//tweetpageobj.clickProduct();
		//tweetpageobj.close1();
		tweetpageobj.clickProduct();
		Assert.assertTrue(tweetpageobj.btnverifyTweet().isDisplayed());
		Assert.assertTrue(tweetpageobj.btnverifyFace().isDisplayed());
		Assert.assertTrue(tweetpageobj.btnverifyTweet().isDisplayed(), "bkjfkfn3fkn jknjkne3k");
	}
	
	
	@Test
	public void discribtionWordCount(){
		System.out.println(tweetpageobj.ProductCounttxt());
		Assert.assertTrue(tweetpageobj.ProductCounttxt()<=150, "Product Count is more the 150");
	}
	
	
	
	
	
	
	
	
	
	
}
