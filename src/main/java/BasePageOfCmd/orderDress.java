package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class orderDress extends BasePage {

	public orderDress() {
		PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath = "//*[@id='center_column']/ul/li[5]/div/div[2]/h5/a")
	private WebElement dressName;

	public void clickDressName() {
		dressName.click();
	}
@FindBy(xpath="//*[@class='btn btn-default button-minus product_quantity_down']")
	private WebElement btnQtyminus;
@FindBy(xpath="//*[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement btnQtyPlus;

public WebElement btnMinus() {
	return btnQtyminus;
}
public WebElement btnPlus() {
	return btnQtyPlus;
}	
	@FindBy(id="group_1")
	private WebElement btnDressSize;
	
	public void dressSize() {
		Select size= new Select(btnDressSize);
	     size.selectByVisibleText("L");
	}
	public void btnDressQtyPlusClick() {
		btnPlus().click();
	}
	@FindBy(id="add_to_cart")
	private WebElement addToCart;
	
	public void btnAddToCartClick() {
		addToCart.click();
	}
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;
	
	public void btnProceedClick() {
		btnProceedToCheckout.click();
	}
	
	@FindBy(xpath="//*[@class='product-name']//a[text()='Printed Chiffon Dress']")
	private WebElement productName;
	
	public WebElement productTitle() {
		return productName;
	}
	
	@FindBy(xpath="//*[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement btnProceedTocheck2;
	
	public void btnproceed2Click() {
		btnProceedTocheck2.click();
	}
	@FindBy(id="email")
	private WebElement txtMailInput;
	
	@FindBy(id="passwd")
	private WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	private WebElement logIn;
	
	
	public void login() {
		setText(txtMailInput, "sriramkumar5893@gmail.com");
		setText(txtPassword, "sriram55");
		logIn.click();
	}
	
	@FindBy(name="processAddress")
	private WebElement btnProceedToCheck3;
	
	public void btnProceed3() {
		btnProceedToCheck3.click();
	}
	@FindBy(id="cgv")
	private WebElement btnCheckBox;
	public void btnCheckBoxClick() {
		btnCheckBox.click();
		}
	
	@FindBy(name="processCarrier")
	private WebElement btnProceed4;
	
	public void btnClickProceedCarrier() {
		btnProceed4.click();
	}
	
	@FindBy(xpath="//*[@class='payment_module']//a[@title='Pay by bank wire']")
	private WebElement btnPayment;
	
	public void btnPayment() {
	   btnPayment.click();	
	}
	
	
	@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
	private WebElement confirmOrder;
	
	public void btnOrderConfirmClick() {
		confirmOrder.click();
	}
	
	@FindBy(xpath="//*[@class='box']//strong")
	private WebElement txtMsgOrderCompleted;
	
	public String txtSucessMsg() {
		String ConfirmMsg=txtMsgOrderCompleted.getText();
		return  ConfirmMsg;
	}
	
	
	
	
}
