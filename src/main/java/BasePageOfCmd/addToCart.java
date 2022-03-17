package BasePageOfCmd;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class addToCart extends BasePage {

	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")
	private WebElement imgProduct;


	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")
	private WebElement addToCartIcon;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[3]/div/div[2]/h5/a")
	private WebElement productName;

	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	private WebElement txtSuccesMsgAddToCart;

	@FindBy(id = "layer_cart_product_title")
	private WebElement addCartProductName;
	
	
	Actions ac=new Actions(driver);

	public addToCart() {
		PageFactory.initElements(driver, this);
	}

	public void mouseMove() {

	ac.moveToElement(imgProduct).build().perform();
	}
	
	public String itemName() {
		String name=productName.getText();
		return name;
	}

	public void moveTomouseAddCart() {
		ac.moveToElement(addToCartIcon).build().perform();	}
	
	public void clickaddToCart() {
		 addToCartIcon.click();
	}


/*	public String CartAddedName() {
		String addedIteam = addCartProductName.getText();
		return addedIteam;
	}*/

	@FindBy(xpath="//*[@class='btn btn-default button button-medium']")
	WebElement btnProcessToCheckout;
	
	@FindBy(xpath="//*[@id='product_5_19_0_0']//td[2]//p/a")
	WebElement addedName;
	
	
	public void btnClickProcessToCartUsingJS() {
		JavascriptExecutor executor=(JavascriptExecutor)driver ;
		executor.executeScript("arguments[0].click()", btnProcessToCheckout);
	}
	
	/*public void clickbtnProcessToCheck() {
		btnProcessToCheckout.click();
		}*/
	public String addedPartName() {
		String prodName=addedName.getText();
		return prodName;
	}
	
}
