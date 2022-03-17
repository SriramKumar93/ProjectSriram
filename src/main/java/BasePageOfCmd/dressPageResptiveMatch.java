package BasePageOfCmd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dressPageResptiveMatch  extends BasePage{

	@FindBy(xpath="//*[@class='heading-counter']")
	WebElement txtHeadProductCount;
	
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']/li"))
		java.util.List<WebElement> TotalProduct; 	
	
	
	
	public dressPageResptiveMatch() {
		PageFactory.initElements(driver, this);
	}
	
	public int getProductCount() {
		/*String headertxt=txtHeadProductCount.getText();
		String []arr=headertxt.split(" ");
		String txt=arr[2];
		int value=Integer.parseInt(txt);
		return value;*/
		return Integer.parseInt(txtHeadProductCount.getText().split(" ")[2]);
		
		
	}
	public int getTotalProdcutCount() {
		return TotalProduct.size();
		
	}
	
	
}
