package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ContactUsPage {

    private SHAFT.GUI.WebDriver driver;

    public ContactUsPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By ContactUsButton = By.xpath("//ul[@class=\"nav navbar-nav\"]//a[@href=\"/contact_us\"]");
    private By GetInTouch = By.xpath("//div[@class=\"contact-form\"]//h2[@class=\"title text-center\"]");
    private By NameTextField = By.xpath("//input[@data-qa=\"name\"]");
    private By EmailTextField = By.xpath("//input[@data-qa=\"email\"]");
    private By SubjectTextField = By.xpath("//input[@data-qa=\"subject\"]");
    private By MessageTextField = By.xpath("//textarea[@data-qa=\"message\"]");
    private By ChooseFileButton = By.xpath("//input[@type=\"file\"]");
    private By SubmitButton = By.xpath("//input[@data-qa=\"submit-button\"]");
    private By SuccessMessage = By.xpath("//div[@class=\"status alert alert-success\"]");
    private By ReturnHomeButton = By.xpath("//a[@class=\"btn btn-success\"]");

    public ContactUsPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public ContactUsPage clickOnContactUsButton() {
        driver.element().click(ContactUsButton);
        return this;
    }

    public ContactUsPage fillNameTextField(String name) {
        driver.element().type(NameTextField, name);
        return this;
    }

    public ContactUsPage fillEmailTextField(String email) {
        driver.element().type(EmailTextField, email);
        return this;
    }

    public ContactUsPage fillSubjectTextField(String subject) {
        driver.element().type(SubjectTextField, subject);
        return this;
    }

    public ContactUsPage fillMessageTextField(String message) {
        driver.element().type(MessageTextField, message);
        return this;
    }
    

    public ContactUsPage clickOnChooseFileButton(String filePath) {
        driver.element().typeFileLocationForUpload(ChooseFileButton, filePath);
        return this;
    }

    public ContactUsPage clickOnSubmitButton(){
        driver.element().click(SubmitButton);
        return this;
    }

    public ContactUsPage handleAlert(){
        driver.alert().acceptAlert();
        return this;
    }

    public ContactUsPage clickOnReturnHomeButton(){
        driver.element().click(ReturnHomeButton);
        return this;
    }


    @Step("Validate that the user is on Home Page")
    public ContactUsPage ValidateHomePage(){
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that GET IN TOUCH is visible")
    public ContactUsPage validateGetInTouch(){
        driver.element().verifyThat(GetInTouch).text().contains("GET IN TOUCH");
        return this;
    }

    @Step("Validate that success message is visible")
    public ContactUsPage validateSuccessMessage() {
        driver.element().verifyThat(SuccessMessage).text().contains("Success! Your details have been submitted successfully");
        return this;
    }


}