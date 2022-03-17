package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dressPageObject extends BasePage {
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement t_ShirtsTab;
	
	public WebElement T_ShritDisplay() {
		return t_ShirtsTab;
	}
	public void clickTshirt() {
		t_ShirtsTab.click();
	}

	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	private WebElement txtProductName;
	
	public void clickProduct() {
		txtProductName.click();
	}
	
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label")
	WebElement sizeS;
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	WebElement sizeM;
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	WebElement sizeL;
	
	public dressPageObject(){
	PageFactory.initElements(driver, this);
	
	}
		public WebElement setSizeS() {
		return getelement(sizeS);
	}
	public WebElement setSizeM() {
		return getelement(sizeM);
	}
	
	public WebElement setSizeL() {
		return getelement(sizeL);
	}
	
	
	
	
	
	
	
}
