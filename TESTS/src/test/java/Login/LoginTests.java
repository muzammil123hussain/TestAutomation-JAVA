package Login;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseClass {

    @Test
    public void testSuccessfullLogin(){
        LoginPage login = homePage.clickFormAuthenticationLink();
        login.enterUsername("tomsmith");
        login.enterPassword("SuperSecretPassword!");
        SecureAreaPage securearea  = login.clickLoginBtn();
        assertTrue(securearea.getAlertMsg().contains("You logged into a secure area!"), "Alert Text is incorrect");
    }
}
