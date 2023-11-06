package Alerts;

import Base.BaseClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseClass {
    @Test
    public void testJsOkAlert(){
        var okAlert = homePage.clickAlertsLink();
        okAlert.clickTriggerOkAlertButton();
        assertEquals(okAlert.getAlertTxt(),"I am a JS Alert","alert text is not as expected");
        okAlert.clickAlertOk();
        assertEquals(okAlert.getResultTxt(),"You successfully clicked an alert","result text is not as expected");
    }
    @Test
    public void testJsOkConfirmAlert(){
        var confirmAlert = homePage.clickAlertsLink();
        confirmAlert.clickTriggerConfirmAlertButton();
        assertEquals(confirmAlert.getAlertTxt(),"I am a JS Confirm","alert text is not as expected");
        confirmAlert.clickAlertConfirm();
        assertEquals(confirmAlert.getResultTxt(),"You clicked: Ok","result text is not as expected");
    }
    @Test
    public void testJsCancelConfirmAlert(){
        var confirmAlert = homePage.clickAlertsLink();
        confirmAlert.clickTriggerConfirmAlertButton();
        assertEquals(confirmAlert.getAlertTxt(),"I am a JS Confirm","alert text is not as expected");
        confirmAlert.clickAlertCancel();
        assertEquals(confirmAlert.getResultTxt(),"You clicked: Cancel","result text is not as expected");
    }
    @Test
    public void testJsPromptAlert(){
        var promptAlert = homePage.clickAlertsLink();
        promptAlert.clickTriggerPromptAlertButton();
        assertEquals(promptAlert.getAlertTxt(),"I am a JS prompt","alert text is not as expected");
        promptAlert.sendKeysInAlert("Muzammil Hussain");
        promptAlert.clickAlertConfirm();
        assertEquals(promptAlert.getResultTxt(),"You entered: Muzammil Hussain","result text is not as expected");
    }
}