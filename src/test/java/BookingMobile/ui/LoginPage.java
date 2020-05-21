package BookingMobile.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static Target LOGIN_BUTTON= Target.the("login button").locatedBy("//a[@data-track-event='header_profile_btn']");
    public static Target EMAIL_FIELD= Target.the("login button").locatedBy("//input[@id='username']");
    public static Target NEXT_BUTTON= Target.the("login button").locatedBy("//span[@class='bui-button__text']");
    public static Target PASSWORD_FIELD= Target.the("login button").locatedBy("//input[@id='password']");
    public static Target SUBMIT_BUTTON= Target.the("login button").locatedBy("//button[@type='submit']");
}
