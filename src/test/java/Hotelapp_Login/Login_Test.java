package Hotelapp_Login;
import org.testng.annotations.Test;
import TestingFrame.LoginObject;
import graphql.Assert;

@Test
public class Login_Test {

	LoginObject loginObj;
	 public  Login_Test() {
			
	 loginObj=new LoginObject();
	 }	
	 
	/*public void SuccessfullLogin(){
		loginObj.loginToApplication("sriramkumar093", "9D920Z");
		Assert.assertTrue(          ,"success");
		 */
		 
	
	 @Test
	 public void verifyInvalidLogin(){
		 loginObj.loginToApplication("Sriramkumar","Sriram");
		String invalidmsg= loginObj.getInvalidLoginMsg();
				 Assert.assertTrue(invalidmsg.contains("Invalid Login details or Your Password might have expired. "));
	 
	 
	 
	 
	 }
	
	
	
	
	
	
	
}
