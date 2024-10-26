package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="firstName")
    public static WebElement firstnameLocator;

    @FindBy(id="middlename")
    public WebElement middlenameLocator;

    @FindBy(id="lastname")
    public static WebElement lastnameLocator;

    @FindBy(id="btnSave")
    public static WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
