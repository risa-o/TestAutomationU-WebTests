package submit;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class RetrievePasswordTest extends BaseTests {

    @Test
    public void testPasswordRetrieval() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailField("test@email.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getContentConfirmation().contains("Your e-mail's been sent!"),"Alert text incorrect.");
    }
}
