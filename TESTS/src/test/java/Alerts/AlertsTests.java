package Alerts;

import Base.BaseClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseClass {
    @Test
    public void testJsOkAlert(){
        var okAlert = homePage.clickAlertsLink();
        okAlert.clickTriggerAlertButton();
        assertEquals(okAlert.getAlertTxt(),"I am a JS Alert","alert text is not as expected");
        okAlert.clickAlertOk();
        assertEquals(okAlert.getResultTxt(),"You successfully clicked an alert","result text is not as expected");
    }
}
