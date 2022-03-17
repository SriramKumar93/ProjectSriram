package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObj extends BasePage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womentab;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressTab;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement t_ShirtsTab;		
	
	public HomePageObj() {
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement womenTabdisplay() {
		return womentab;
	}
	public WebElement DressTabDisplay() {
		return getelement(dressTab);
	}
	public WebElement T_ShritDisplay() {
		return t_ShirtsTab;
	}

	public void clickwoman() {
		womentab.click();
	}
	public void clickDress() {
		dressTab.click();
	}
	public void clickTshirt() {
		t_ShirtsTab.click();
	}
	
	@FindBy(id="newsletter-input")
	WebElement enterMailID;
	
	public void setEmailID(String mailID) {
		setText(enterMailID, mailID);	
	}
	
	@FindBy(name="submitNewsletter")
	private WebElement Submit;
	
	public void clickNewsletter() {
		Submit.click();	
	}
	
	@FindBy(xpath="//*[@class='alert alert-success'] ")
	private WebElement txtMsgofSubcrib;
	
	public String getMsgofsubcrib() {
		return txtMsgofSubcrib.getText();
	}
	
}
