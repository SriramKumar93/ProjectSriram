package TestingFrame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends BasePage{
	
    @FindBy(id="username")
   private WebElement txtBoxUserName;
	
	
	@FindBy(id="password")
	private WebElement txtBoxPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(className="auth_error")
	private WebElement txtInvalidCredentials;
	
	
	
	public LoginObject() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String user,String password) {
		setText(txtBoxUserName, user);
		setText(txtBoxPassword, password);
		btnLogin.click();
		
	}
	public String getInvalidLoginMsg() {
		return txtInvalidCredentials.getText();
				 
	}
	
	
	
	
	
	
	
	
}
