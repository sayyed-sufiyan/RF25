package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SATE {
	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement pwtb;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Loginbtn;
	SATE(WebDriver driver){
		PageFactory.initElements(driver,this);	
	}

	public void setUsername(String un) {
		untb.clear();
		untb.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwtb.clear();
		pwtb.sendKeys(pw);
	}
	public void clickLogin() {
		Loginbtn.click();
	}
}
