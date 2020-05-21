package BookingMobile.features.search;

import BookingMobile.abilities.GetInfoLogin;
import BookingMobile.questions.DashBoard;
import BookingMobile.tasks.Login;
import BookingMobile.tasks.OpenTheApplication;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;
@RunWith(SerenityRunner.class)
public class LoginStory {
    Actor anna = Actor.named("anna");
    @Steps
    OpenTheApplication openTheApplication;
    @Managed
    public WebDriver herBrowser;

    @Before
    public void annaCanOpenTheApplication(){
        anna.can(BrowseTheWeb.with(herBrowser))
                .whoCan(GetInfoLogin.fromHerLoginInfo());

    }

    @Test
    public void anna_want_to_login_to_Booking_page(){
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(
                Login.withHerInfor()
        );
        anna.should(
                seeThat(DashBoard.getTitle(),containsString("Quynh"))
        );
    }
}
