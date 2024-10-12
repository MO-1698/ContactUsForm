import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.ContactUsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTests {
    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate contact us")
    private void validateContactUs() {
        new ContactUsPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnContactUsButton().validateGetInTouch()
                .fillNameTextField("Sam").fillEmailTextField("Sam@yahoo.com")
                .fillSubjectTextField("Test").fillMessageTextField("This is just a test")
                .clickOnChooseFileButton("C:\\Users\\acer\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-10-12 145652.png")
                .clickOnSubmitButton().handleAlert().validateSuccessMessage().clickOnReturnHomeButton().ValidateHomePage();
    }
}

