package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tweet_Facechecked extends BasePage{
	
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[2]/div/div[2]/h5/a")
	private WebElement imgProduct;
	
	@FindBy(xpath="//*[@id='center_column']//button[@class='btn btn-default btn-twitter']")
	private WebElement btnTweet;

	@FindBy(xpath="//*[@id='center_column']//button[@class='btn btn-default btn-facebook']")
	private WebElement btnFcaebook;
	
	public tweet_Facechecked() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProduct() {
		imgProduct.click();
	}
	
	public WebElement btnverifyTweet() {
		return btnTweet;
	}
	
	public WebElement btnverifyFace() {
		return btnFcaebook;
	}
	
	@FindBy(xpath="//*[@id='category']/div[2]/div/div/a")
	WebElement clickClose;
	
	public void close1(){
		clickClose.click();
	}
	
	@FindBy(id="short_description_content")
	WebElement  productCount;
	
	public int ProductCounttxt() {
		String word=productCount.getText();
		char[] arr= word.toCharArray();
		int Count=arr.length;
		return Count;
		
		
		
	}
	
	
	
}
