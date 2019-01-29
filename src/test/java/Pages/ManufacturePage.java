package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ManufacturePage {

    public ManufacturePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement Database;

    @FindBy(id = "login")
    public WebElement Email;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement LoginBtn;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement ManufactLink;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createBtn;

    @FindBy(xpath = "//*[@id=\"o_field_input_248\"]")
    public List<WebElement> Product;

    @FindBy(xpath = "//li[@id='ui-id-55']")
    public WebElement CreateAndEdit;











}
