package Login;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseClass {

    @Test
    public void testSuccessfullLogin(){
        LoginPage login = homePage.clickFormAuthenticationLink();
        login.enterPassword("tomsmith");
        login.enterPassword("SuperSecretPassword!");
        SecureArea securearea  = login.clickLoginBtn();
        assertEquals(securearea.getAlertMsg(), "You logged into a secure area! X", "Alert Text is incorrect");
    }
}
