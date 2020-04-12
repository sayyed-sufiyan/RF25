package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerPom {
@FindBy(id="username")
private WebElement untb;
@FindBy(id="password")
private WebElement pwtb;
@FindBy(xpath="//button[.='Sign in']")
private WebElement signIn;
VtigerPom(WebDriver driver){
	PageFactory.initElements(driver,this);	
}

public void setUsn(String un) throws InterruptedException {
	untb.clear();
	Thread.sleep(2000);
	untb.sendKeys(un);
}

public void setPwd(String pw) throws InterruptedException {
	pwtb.clear();
	Thread.sleep(2000);
	pwtb.sendKeys(pw);
}
public void clickSignin() {
	signIn.click();
}
}
