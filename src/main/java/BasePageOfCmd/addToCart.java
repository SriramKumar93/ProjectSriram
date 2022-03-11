package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.PublicApi;

public class addToCart extends BasePage{

	@FindBy(xpath="//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")
	 private WebElement imgProduct;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]/span")
	private WebElement addToCartIcon;
	
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement txtSuccesMsgAddToCart;
	
	@FindBy(id="layer_cart_product_title")
	WebElement addCartProductName;
	
	
	public addToCart() {
		PageFactory.initElements(driver, this);
	}
		
		public WebElement clickProdcut(){
		return imgProduct;
		}
	public WebElement clickaddToCart() {
		return addToCartIcon;
	}
		
	public String productName() {
		String item=imgProduct.getText();
		return item;
	}	
	public String CartAddedName() {
		String addedIteam=addCartProductName.getText();
		return addedIteam;
	}	
		
		
		
		
		
		
		
		
		
	}
	

