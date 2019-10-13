package Pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;

}
